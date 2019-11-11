package systems.danger.java.model.git;

import systems.danger.java.model.git.commit.Commit;

import java.util.List;

public class Git {

    private final List<String> modifiedFiles;
    private final List<String> creatediles;
    private final List<String> deletedFiles;
    private final List<Commit> commits;

    public Git(List<String> modifiedFiles, List<String> creatediles, List<String> deletedFiles,
               List<Commit> commits) {
        this.modifiedFiles = modifiedFiles;
        this.creatediles = creatediles;
        this.deletedFiles = deletedFiles;
        this.commits = commits;
    }

    public List<String> getModifiedFiles() {
        return modifiedFiles;
    }

    public List<String> getCreatediles() {
        return creatediles;
    }

    public List<String> getDeletedFiles() {
        return deletedFiles;
    }

    public List<Commit> getCommits() {
        return commits;
    }
}
