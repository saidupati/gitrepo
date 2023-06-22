package com.ojas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;

public class RetreveSpecificRepositoryBrachCommits {
    public static void main(String[] args) {
        String apiUrl = "https://api.github.com/repos/{username}/{repository}/branches";
        String username = "saidupati";
        String repository = "TopCrowdPrograms";
        String authToken = "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";

        try {
            URL url = new URL(apiUrl.replace("{username}", username).replace("{repository}", repository));
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization", "Bearer " + authToken);

            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();

                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }

                reader.close();

                JSONArray branchesArray = new JSONArray(response.toString());
                for (int i = 0; i < branchesArray.length(); i++) {
                    JSONObject branchObject = branchesArray.getJSONObject(i);
                    String branchName = branchObject.getString("name");
                    String branchUrl = branchObject.getJSONObject("commit").getString("url");

                    URL commitUrl = new URL(branchUrl);
                    HttpURLConnection commitConnection = (HttpURLConnection) commitUrl.openConnection();
                    commitConnection.setRequestMethod("GET");
                    commitConnection.setRequestProperty("Authorization", "Bearer " + authToken);

                    int commitResponseCode = commitConnection.getResponseCode();

                    if (commitResponseCode == HttpURLConnection.HTTP_OK) {
                        BufferedReader commitReader = new BufferedReader(new InputStreamReader(commitConnection.getInputStream()));
                        StringBuilder commitResponse = new StringBuilder();

                        String commitLine;
                        while ((commitLine = commitReader.readLine()) != null) {
                            commitResponse.append(commitLine);
                        }

                        commitReader.close();

                        JSONObject commitObject = new JSONObject(commitResponse.toString());
                        JSONObject commitData = commitObject.getJSONObject("commit");
                        String commitMessage = commitData.getString("message");
                        String committedDate = commitData.getJSONObject("author").getString("date");
                        String committedBy = commitData.getJSONObject("author").getString("name");

                        System.out.println("Branch: " + branchName);
                        System.out.println("Commit Message: " + commitMessage);
                        System.out.println("Committed Date: " + committedDate);
                        System.out.println("Committed By: " + committedBy);
                        System.out.println("---------------------");
                    } else {
                        System.out.println("Commit request failed. Response Code: " + commitResponseCode);
                    }

                    commitConnection.disconnect();
                }
            } else {
                System.out.println("Request failed. Response Code: " + responseCode);
            }

            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

