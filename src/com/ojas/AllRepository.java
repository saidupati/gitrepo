package com.ojas;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class AllRepository {

	public static void main(String[] args) {
        String apiUrl = " https://api.github.com/orgs/ojashub/repos";
        String username = "saidupati";
        String authToken = "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";

        try {
            URL url = new URL(apiUrl.replace("{username}", username));
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization", "Bearer " + authToken);

            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }

                reader.close();

                System.out.println("Response: " + response.toString());
            } else {
                System.out.println("Request failed. Response Code: " + responseCode);
            }

            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

