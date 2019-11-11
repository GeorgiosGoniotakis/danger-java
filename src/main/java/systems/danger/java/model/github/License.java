package systems.danger.java.model.github;

public class License {
    private final String key;
    private final String name;
    private final String spdxId;
    private final String url;
    private final String nodeId;

    public License(String key, String name, String spdxId, String url, String nodeId) {
        this.key = key;
        this.name = name;
        this.spdxId = spdxId;
        this.url = url;
        this.nodeId = nodeId;
    }

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public String getSpdxId() {
        return spdxId;
    }

    public String getUrl() {
        return url;
    }

    public String getNodeId() {
        return nodeId;
    }
}
