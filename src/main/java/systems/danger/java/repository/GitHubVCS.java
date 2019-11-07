package systems.danger.java.repository;

import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;
import systems.danger.java.config.Definitions;
import systems.danger.java.config.Environment;
import systems.danger.java.misc.Exit;

import java.io.IOException;

public class GitHubVCS extends Repository {

    private GitHub github;
    private static GitHubVCS instance = null;

    private GitHubVCS(){}

    public static GitHubVCS getInstance(){
        if (instance == null){
            instance = new GitHubVCS();
            instance.authenticate();
        }
        return instance;
    }

    @Override
    public void authenticate() {

        String token = Environment.retrieveEnvVariable(Definitions.GITHUB_API_TOKEN);

        if (token == null) {
            System.err.println("Token is not set");
            System.exit(Exit.NO_GITHUB_TOKEN_SET.code);
        }

        try {
            this.github = new GitHubBuilder().withOAuthToken(token).build();
        } catch (IOException ioe) {
            System.out.println("Oua oua oua");
        }
    }

    @Override
    public String toString() {
        return null;
    }

    public GitHub getGithub() {
        return this.github;
    }


}
