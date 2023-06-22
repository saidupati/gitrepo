package com.ojas;





import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;


public class RetriveSpecificBranchCommits {
    public static void main(String[] args) {
        String apiUrl = "https://api.github.com/repos/{username}/{repository}/commits?sha={branch}";
        String username = "saidupati";
        String repository = "SpringApplications";
        String branch = "Spring_Security_Applications";
        String authToken = "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";

        try {
            URL url = new URL(apiUrl.replace("{username}", username)
                    .replace("{repository}", repository)
                    .replace("{branch}", branch));
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

                // Extract necessary information from the response
                JSONArray commitsArray = new JSONArray(response.toString());
                for (int i = 0; i < commitsArray.length(); i++) {
                    JSONObject commitObject = commitsArray.getJSONObject(i);
                    JSONObject commitData = commitObject.getJSONObject("commit");
                    String branchName = branch;
                    String commitMessage = commitData.getString("message");
                    String committedDate = commitData.getJSONObject("committer").getString("date");
                    String committedBy = commitData.getJSONObject("author").getString("name");

                    System.out.println("Branch: " + branchName);
                    System.out.println("Commit Message: " + commitMessage);
                    System.out.println("Committed Date: " + committedDate);
                    System.out.println("Committed By: " + committedBy);
                    System.out.println("---------------------");
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



