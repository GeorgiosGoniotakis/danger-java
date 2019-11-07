package systems.danger.java.misc;

public enum Exit {
    NO_GITHUB_TOKEN_SET(1);

    public final int code;

    Exit(int code){
        this.code = code;
    }
}
