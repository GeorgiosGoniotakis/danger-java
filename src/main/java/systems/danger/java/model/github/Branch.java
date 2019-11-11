package systems.danger.java.model.github;

import systems.danger.java.model.github.issue.User;

public class Branch {
    private final String label;
    private final String ref;
    private final String sha;
    private final User user;
    private final Repo repo;

    public Branch(String label, String ref, String sha, User user, Repo repo) {
        this.label = label;
        this.ref = ref;
        this.sha = sha;
        this.user = user;
        this.repo = repo;
    }

    public String getLabel() {
        return label;
    }

    public String getRef() {
        return ref;
    }

    public String getSha() {
        return sha;
    }

    public User getUser() {
        return user;
    }

    public Repo getRepo() {
        return repo;
    }
}
