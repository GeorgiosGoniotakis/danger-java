package systems.danger.java.model.git.commit;

import java.util.List;

public class Commit {

    private final String sha;
    private final List<String> parents;
    private final Author author;
    private final Commiter committer;
    private final String message;
    private final Tree tree;
    private final String url;

    public Commit(String sha, List<String> parents, Author author, Commiter committer,
                  String message, Tree tree, String url) {
        this.sha = sha;
        this.parents = parents;
        this.author = author;
        this.committer = committer;
        this.message = message;
        this.tree = tree;
        this.url = url;
    }

    public String getSha() {
        return sha;
    }

    public List<String> getParents() {
        return parents;
    }

    public Author getAuthor() {
        return author;
    }

    public Commiter getCommitter() {
        return committer;
    }

    public String getMessage() {
        return message;
    }

    public Tree getTree() {
        return tree;
    }

    public String getUrl() {
        return url;
    }
}
