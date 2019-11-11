package systems.danger.java.model.github;

public class Links {
    private final String self;
    private final String html;
    private final String issue;
    private final String comments;
    private final String reviewComments;
    private final String reviewComment;
    private final String commits;
    private final String statuses;

    public Links(String self, String html, String issue, String comments, String reviewComments, String reviewComment, String commits, String statuses) {
        this.self = self;
        this.html = html;
        this.issue = issue;
        this.comments = comments;
        this.reviewComments = reviewComments;
        this.reviewComment = reviewComment;
        this.commits = commits;
        this.statuses = statuses;
    }

    public String getSelf() {
        return self;
    }

    public String getHtml() {
        return html;
    }

    public String getIssue() {
        return issue;
    }

    public String getComments() {
        return comments;
    }

    public String getReviewComments() {
        return reviewComments;
    }

    public String getReviewComment() {
        return reviewComment;
    }

    public String getCommits() {
        return commits;
    }

    public String getStatuses() {
        return statuses;
    }
}
