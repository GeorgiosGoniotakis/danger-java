package systems.danger.java.model.git.commit;

public class Tree {
    private final String sha;
    private final String url;

    public Tree(String sha, String url) {
        this.sha = sha;
        this.url = url;
    }

    public String getSha() {
        return sha;
    }

    public String getUrl() {
        return url;
    }
}
