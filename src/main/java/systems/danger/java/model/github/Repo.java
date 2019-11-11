package systems.danger.java.model.github;

import systems.danger.java.model.github.issue.User;

public class Repo {
    private final int id;
    private final String nodeId;
    private final String name;
    private final String fullName;
    private final boolean prvt;
    private final User owner;
    private final String htmlUrl;
    private final String description;
    private final boolean fork;
    private final String url;
    private final String forksUrl;
    private final String keysUrl;
    private final String collaboratorsUrl;
    private final String teamsUrl;
    private final String hooksUrl;
    private final String issueEventsUrl;
    private final String eventsUrl;
    private final String assigneesUrl;
    private final String branchesUrl;
    private final String tagsUrl;
    private final String blobsUrl;
    private final String gitTagsUrl;
    private final String gitRefsUrl;
    private final String treesUrl;
    private final String statusesUrl;
    private final String languagesUrl;
    private final String stargazersUrl;
    private final String contributorsUrl;
    private final String subscribersUrl;
    private final String subscriptionUrl;
    private final String commitsUrl;
    private final String gitCommitsUrl;
    private final String commentsUrl;
    private final String issueCommentUrl;
    private final String contentsUrl;
    private final String compareUrl;
    private final String mergesUrl;
    private final String archiveUrl;
    private final String downloadsUrl;
    private final String issuesUrl;
    private final String pullsUrl;
    private final String milestonesUrl;
    private final String notificationsUrl;
    private final String labelsUrl;
    private final String releasesUrl;
    private final String deploymentsUrl;
    private final String createdAt;
    private final String updatedAt;
    private final String pushedAt;
    private final String gitUrl;
    private final String sshUrl;
    private final String cloneUrl;
    private final String svnUrl;
    private final String homepage;
    private final int size;
    private final int stargazersCount;
    private final int watchersCount;
    private final String language;
    private final boolean hasIssues;
    private final boolean hasProjects;
    private final boolean hasDownloads;
    private final boolean hasWiki;
    private final boolean hasPages;
    private final int forksCount;
    private final String mirrorUrl;
    private final boolean archived;
    private final boolean disabled;
    private final int openIssuesCount;
    private final License license;
    private final int forks;
    private final int openIssues;
    private final int watchers;
    private final String defaultBranch;

    public Repo(int id, String nodeId, String name, String fullName, boolean prvt, User owner, String htmlUrl, String description, boolean fork, String url, String forksUrl, String keysUrl, String collaboratorsUrl, String teamsUrl, String hooksUrl, String issueEventsUrl, String eventsUrl, String assigneesUrl, String branchesUrl, String tagsUrl, String blobsUrl, String gitTagsUrl, String gitRefsUrl, String treesUrl, String statusesUrl, String languagesUrl, String stargazersUrl, String contributorsUrl, String subscribersUrl, String subscriptionUrl, String commitsUrl, String gitCommitsUrl, String commentsUrl, String issueCommentUrl, String contentsUrl, String compareUrl, String mergesUrl, String archiveUrl, String downloadsUrl, String issuesUrl, String pullsUrl, String milestonesUrl, String notificationsUrl, String labelsUrl, String releasesUrl, String deploymentsUrl, String createdAt, String updatedAt, String pushedAt, String gitUrl, String sshUrl, String cloneUrl, String svnUrl, String homepage, int size, int stargazersCount, int watchersCount, String language, boolean hasIssues, boolean hasProjects, boolean hasDownloads, boolean hasWiki, boolean hasPages, int forksCount, String mirrorUrl, boolean archived, boolean disabled, int openIssuesCount, License license, int forks, int openIssues, int watchers, String defaultBranch) {
        this.id = id;
        this.nodeId = nodeId;
        this.name = name;
        this.fullName = fullName;
        this.prvt = prvt;
        this.owner = owner;
        this.htmlUrl = htmlUrl;
        this.description = description;
        this.fork = fork;
        this.url = url;
        this.forksUrl = forksUrl;
        this.keysUrl = keysUrl;
        this.collaboratorsUrl = collaboratorsUrl;
        this.teamsUrl = teamsUrl;
        this.hooksUrl = hooksUrl;
        this.issueEventsUrl = issueEventsUrl;
        this.eventsUrl = eventsUrl;
        this.assigneesUrl = assigneesUrl;
        this.branchesUrl = branchesUrl;
        this.tagsUrl = tagsUrl;
        this.blobsUrl = blobsUrl;
        this.gitTagsUrl = gitTagsUrl;
        this.gitRefsUrl = gitRefsUrl;
        this.treesUrl = treesUrl;
        this.statusesUrl = statusesUrl;
        this.languagesUrl = languagesUrl;
        this.stargazersUrl = stargazersUrl;
        this.contributorsUrl = contributorsUrl;
        this.subscribersUrl = subscribersUrl;
        this.subscriptionUrl = subscriptionUrl;
        this.commitsUrl = commitsUrl;
        this.gitCommitsUrl = gitCommitsUrl;
        this.commentsUrl = commentsUrl;
        this.issueCommentUrl = issueCommentUrl;
        this.contentsUrl = contentsUrl;
        this.compareUrl = compareUrl;
        this.mergesUrl = mergesUrl;
        this.archiveUrl = archiveUrl;
        this.downloadsUrl = downloadsUrl;
        this.issuesUrl = issuesUrl;
        this.pullsUrl = pullsUrl;
        this.milestonesUrl = milestonesUrl;
        this.notificationsUrl = notificationsUrl;
        this.labelsUrl = labelsUrl;
        this.releasesUrl = releasesUrl;
        this.deploymentsUrl = deploymentsUrl;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.pushedAt = pushedAt;
        this.gitUrl = gitUrl;
        this.sshUrl = sshUrl;
        this.cloneUrl = cloneUrl;
        this.svnUrl = svnUrl;
        this.homepage = homepage;
        this.size = size;
        this.stargazersCount = stargazersCount;
        this.watchersCount = watchersCount;
        this.language = language;
        this.hasIssues = hasIssues;
        this.hasProjects = hasProjects;
        this.hasDownloads = hasDownloads;
        this.hasWiki = hasWiki;
        this.hasPages = hasPages;
        this.forksCount = forksCount;
        this.mirrorUrl = mirrorUrl;
        this.archived = archived;
        this.disabled = disabled;
        this.openIssuesCount = openIssuesCount;
        this.license = license;
        this.forks = forks;
        this.openIssues = openIssues;
        this.watchers = watchers;
        this.defaultBranch = defaultBranch;
    }

    public int getId() {
        return id;
    }

    public String getNodeId() {
        return nodeId;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isPrvt() {
        return prvt;
    }

    public User getOwner() {
        return owner;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public String getDescription() {
        return description;
    }

    public boolean isFork() {
        return fork;
    }

    public String getUrl() {
        return url;
    }

    public String getForksUrl() {
        return forksUrl;
    }

    public String getKeysUrl() {
        return keysUrl;
    }

    public String getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    public String getTeamsUrl() {
        return teamsUrl;
    }

    public String getHooksUrl() {
        return hooksUrl;
    }

    public String getIssueEventsUrl() {
        return issueEventsUrl;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public String getAssigneesUrl() {
        return assigneesUrl;
    }

    public String getBranchesUrl() {
        return branchesUrl;
    }

    public String getTagsUrl() {
        return tagsUrl;
    }

    public String getBlobsUrl() {
        return blobsUrl;
    }

    public String getGitTagsUrl() {
        return gitTagsUrl;
    }

    public String getGitRefsUrl() {
        return gitRefsUrl;
    }

    public String getTreesUrl() {
        return treesUrl;
    }

    public String getStatusesUrl() {
        return statusesUrl;
    }

    public String getLanguagesUrl() {
        return languagesUrl;
    }

    public String getStargazersUrl() {
        return stargazersUrl;
    }

    public String getContributorsUrl() {
        return contributorsUrl;
    }

    public String getSubscribersUrl() {
        return subscribersUrl;
    }

    public String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    public String getCommitsUrl() {
        return commitsUrl;
    }

    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }

    public String getIssueCommentUrl() {
        return issueCommentUrl;
    }

    public String getContentsUrl() {
        return contentsUrl;
    }

    public String getCompareUrl() {
        return compareUrl;
    }

    public String getMergesUrl() {
        return mergesUrl;
    }

    public String getArchiveUrl() {
        return archiveUrl;
    }

    public String getDownloadsUrl() {
        return downloadsUrl;
    }

    public String getIssuesUrl() {
        return issuesUrl;
    }

    public String getPullsUrl() {
        return pullsUrl;
    }

    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    public String getLabelsUrl() {
        return labelsUrl;
    }

    public String getReleasesUrl() {
        return releasesUrl;
    }

    public String getDeploymentsUrl() {
        return deploymentsUrl;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getPushedAt() {
        return pushedAt;
    }

    public String getGitUrl() {
        return gitUrl;
    }

    public String getSshUrl() {
        return sshUrl;
    }

    public String getCloneUrl() {
        return cloneUrl;
    }

    public String getSvnUrl() {
        return svnUrl;
    }

    public String getHomepage() {
        return homepage;
    }

    public int getSize() {
        return size;
    }

    public int getStargazersCount() {
        return stargazersCount;
    }

    public int getWatchersCount() {
        return watchersCount;
    }

    public String getLanguage() {
        return language;
    }

    public boolean isHasIssues() {
        return hasIssues;
    }

    public boolean isHasProjects() {
        return hasProjects;
    }

    public boolean isHasDownloads() {
        return hasDownloads;
    }

    public boolean isHasWiki() {
        return hasWiki;
    }

    public boolean isHasPages() {
        return hasPages;
    }

    public int getForksCount() {
        return forksCount;
    }

    public String getMirrorUrl() {
        return mirrorUrl;
    }

    public boolean isArchived() {
        return archived;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public int getOpenIssuesCount() {
        return openIssuesCount;
    }

    public License getLicense() {
        return license;
    }

    public int getForks() {
        return forks;
    }

    public int getOpenIssues() {
        return openIssues;
    }

    public int getWatchers() {
        return watchers;
    }

    public String getDefaultBranch() {
        return defaultBranch;
    }
}
