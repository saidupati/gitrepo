package com.ojas;

import java.io.IOException;
import java.util.List;

import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.RepositoryService;

public class RetieveAllRepositories {
	public static void main(String[] args) {

		String accessToken = "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";

		 

		try {

		// Create a GitHub client

		GitHubClient client = new GitHubClient();

		client.setOAuth2Token(accessToken);

		 

		// Create a repository service

		RepositoryService service = new RepositoryService(client);

		 

		// Set the type to retrieve only private repositories

		// service.setType(RepositoryService.TYPE_PRIVATE);

		 

		service.getRepositories(RepositoryService.TYPE_PRIVATE);

		 

		// Retrieve private repositories

		List<Repository> repositories = service.getRepositories();

		 

		// Iterate over the repositories and print their names

		for (Repository repository : repositories) {

		System.out.println(repository.getName());

		}

		} catch (IOException e) {

		e.printStackTrace();

		}

		}

}
