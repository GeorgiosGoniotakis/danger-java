package systems.danger.java.model.github.issue;

import java.util.List;

public class Issue {
    private final String url;
    private final String repositoryUrl;
    private final String labelsUrl;
    private final String commentsUrl;
    private final String eventsUrl;
    private final String htmlUrl;
    private final int id;
    private final String nodeId;
    private final int number;
    private final String title;
    private final User user;
    private final List<String> labels;
    private final String state;
    private final boolean locked;
    private final String assignee;
    private final List<String> assignees; // TODO:: Explore this more
    private final String milestone;
    private final int comments;
    private final String createdAt;
    private final String updatedAt;
    private final String closedAt;
    private final String authorAssociation;
    private final PullRequest pullRequest;
    private final String body;
    private final User closedBy;

    public Issue(String url, String repositoryUrl, String labelsUrl, String commentsUrl, String eventsUrl, String htmlUrl, int id, String nodeId, int number, String title, User user, List<String> labels, String state, boolean locked, String assignee, List<String> assignees, String milestone, int comments, String createdAt, String updatedAt, String closedAt, String authorAssociation, PullRequest pullRequest, String body, User closedBy) {
        this.url = url;
        this.repositoryUrl = repositoryUrl;
        this.labelsUrl = labelsUrl;
        this.commentsUrl = commentsUrl;
        this.eventsUrl = eventsUrl;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.nodeId = nodeId;
        this.number = number;
        this.title = title;
        this.user = user;
        this.labels = labels;
        this.state = state;
        this.locked = locked;
        this.assignee = assignee;
        this.assignees = assignees;
        this.milestone = milestone;
        this.comments = comments;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.closedAt = closedAt;
        this.authorAssociation = authorAssociation;
        this.pullRequest = pullRequest;
        this.body = body;
        this.closedBy = closedBy;
    }

    public String getUrl() {
        return url;
    }

    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    public String getLabelsUrl() {
        return labelsUrl;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public int getId() {
        return id;
    }

    public String getNodeId() {
        return nodeId;
    }

    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    public User getUser() {
        return user;
    }

    public List<String> getLabels() {
        return labels;
    }

    public String getState() {
        return state;
    }

    public boolean isLocked() {
        return locked;
    }

    public String getAssignee() {
        return assignee;
    }

    public List<String> getAssignees() {
        return assignees;
    }

    public String getMilestone() {
        return milestone;
    }

    public int getComments() {
        return comments;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getClosedAt() {
        return closedAt;
    }

    public String getAuthorAssociation() {
        return authorAssociation;
    }

    public PullRequest getPullRequest() {
        return pullRequest;
    }

    public String getBody() {
        return body;
    }

    public User getClosedBy() {
        return closedBy;
    }
}
