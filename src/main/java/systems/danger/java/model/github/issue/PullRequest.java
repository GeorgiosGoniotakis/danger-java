package systems.danger.java.model.github.issue;

public class PullRequest {
    private final String url;
    private final String htmlUrl;
    private final String diffUrl;
    private final String patchUrl;

    public PullRequest(String url, String htmlUrl, String diffUrl, String patchUrl) {
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.diffUrl = diffUrl;
        this.patchUrl = patchUrl;
    }

    public String getUrl() {
        return url;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public String getDiffUrl() {
        return diffUrl;
    }

    public String getPatchUrl() {
        return patchUrl;
    }
}
