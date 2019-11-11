package systems.danger.java.model.github;

import systems.danger.java.model.github.issue.User;

import java.util.List;

public class PR {
    private final String url;
    private final int id;
    private final String nodeId;
    private final String htmlUrl;
    private final String diffUrl;
    private final String patchUrl;
    private final String issueUrl;
    private final int number;
    private final String state;
    private final boolean locked;
    private final String title;
    private final User user;
    private final String body;
    private final String createdAt;
    private final String updatedAt;
    private final String closedAt;
    private final String mergedAt;
    private final String mergeCommitSha;
    private final String assignee;
    private final List<String> assigness; // TODO:: Check this
    private final List<String> requestedReviewers;
    private final List<String> requestedTeams;
    private final List<String> labels;
    private final String milestone;
    private final String commitsUrl;
    private final String reviewCommentsUrl;
    private final String reviewCommentUrl;
    private final String statusesUrl;
    private final Branch head;
    private final Branch base;
    private final Links links;
    private final String authorAssociation;
    private final boolean merged;
    private final boolean mergeable;
    private final boolean rebasable;
    private final String mergeableState;
    private final User mergedBy;
    private final int comments;
    private final int reviewComments;
    private final boolean maintainerCanModify;
    private final int commits;
    private final int additions;
    private final int deletions;
    private final int changedFiles;

    public PR(String url, int id, String nodeId, String htmlUrl, String diffUrl, String patchUrl, String issueUrl, int number, String state, boolean locked, String title, User user, String body, String createdAt, String updatedAt, String closedAt, String mergedAt, String mergeCommitSha, String assignee, List<String> assigness, List<String> requestedReviewers, List<String> requestedTeams, List<String> labels, String milestone, String commitsUrl, String reviewCommentsUrl, String reviewCommentUrl, String statusesUrl, Branch head, Branch base, Links links, String authorAssociation, boolean merged, boolean mergeable, boolean rebasable, String mergeableState, User mergedBy, int comments, int reviewComments, boolean maintainerCanModify, int commits, int additions, int deletions, int changedFiles) {
        this.url = url;
        this.id = id;
        this.nodeId = nodeId;
        this.htmlUrl = htmlUrl;
        this.diffUrl = diffUrl;
        this.patchUrl = patchUrl;
        this.issueUrl = issueUrl;
        this.number = number;
        this.state = state;
        this.locked = locked;
        this.title = title;
        this.user = user;
        this.body = body;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.closedAt = closedAt;
        this.mergedAt = mergedAt;
        this.mergeCommitSha = mergeCommitSha;
        this.assignee = assignee;
        this.assigness = assigness;
        this.requestedReviewers = requestedReviewers;
        this.requestedTeams = requestedTeams;
        this.labels = labels;
        this.milestone = milestone;
        this.commitsUrl = commitsUrl;
        this.reviewCommentsUrl = reviewCommentsUrl;
        this.reviewCommentUrl = reviewCommentUrl;
        this.statusesUrl = statusesUrl;
        this.head = head;
        this.base = base;
        this.links = links;
        this.authorAssociation = authorAssociation;
        this.merged = merged;
        this.mergeable = mergeable;
        this.rebasable = rebasable;
        this.mergeableState = mergeableState;
        this.mergedBy = mergedBy;
        this.comments = comments;
        this.reviewComments = reviewComments;
        this.maintainerCanModify = maintainerCanModify;
        this.commits = commits;
        this.additions = additions;
        this.deletions = deletions;
        this.changedFiles = changedFiles;
    }

    public String getUrl() {
        return url;
    }

    public int getId() {
        return id;
    }

    public String getNodeId() {
        return nodeId;
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

    public String getIssueUrl() {
        return issueUrl;
    }

    public int getNumber() {
        return number;
    }

    public String getState() {
        return state;
    }

    public boolean isLocked() {
        return locked;
    }

    public String getTitle() {
        return title;
    }

    public User getUser() {
        return user;
    }

    public String getBody() {
        return body;
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

    public String getMergedAt() {
        return mergedAt;
    }

    public String getMergeCommitSha() {
        return mergeCommitSha;
    }

    public String getAssignee() {
        return assignee;
    }

    public List<String> getAssigness() {
        return assigness;
    }

    public List<String> getRequestedReviewers() {
        return requestedReviewers;
    }

    public List<String> getRequestedTeams() {
        return requestedTeams;
    }

    public List<String> getLabels() {
        return labels;
    }

    public String getMilestone() {
        return milestone;
    }

    public String getCommitsUrl() {
        return commitsUrl;
    }

    public String getReviewCommentsUrl() {
        return reviewCommentsUrl;
    }

    public String getReviewCommentUrl() {
        return reviewCommentUrl;
    }

    public String getStatusesUrl() {
        return statusesUrl;
    }

    public Branch getHead() {
        return head;
    }

    public Branch getBase() {
        return base;
    }

    public Links getLinks() {
        return links;
    }

    public String getAuthorAssociation() {
        return authorAssociation;
    }

    public boolean isMerged() {
        return merged;
    }

    public boolean isMergeable() {
        return mergeable;
    }

    public boolean isRebasable() {
        return rebasable;
    }

    public String getMergeableState() {
        return mergeableState;
    }

    public User getMergedBy() {
        return mergedBy;
    }

    public int getComments() {
        return comments;
    }

    public int getReviewComments() {
        return reviewComments;
    }

    public boolean isMaintainerCanModify() {
        return maintainerCanModify;
    }

    public int getCommits() {
        return commits;
    }

    public int getAdditions() {
        return additions;
    }

    public int getDeletions() {
        return deletions;
    }

    public int getChangedFiles() {
        return changedFiles;
    }
}
