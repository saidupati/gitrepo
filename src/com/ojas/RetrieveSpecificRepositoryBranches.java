package com.ojas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;

public class RetrieveSpecificRepositoryBranches {
    public static void main(String[] args) {
        String apiUrl = "https://api.github.com/repos/{username}/{repository}/branches";
        String username = "saidupati";
        String repository = "prasanna";
        String authToken = "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";

        try {
            URL url = new URL(apiUrl.replace("{username}", username)
                    .replace("{repository}", repository));
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

                // Extract branch names from the response
                JSONArray branchesArray = new JSONArray(response.toString());
               
                for (int i = 0; i < branchesArray.length(); i++) {
                    JSONObject branchObject = branchesArray.getJSONObject(i);
                    String branchName = branchObject.getString("name");
                    
                    System.out.println("Branch Name: " + branchName);
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

