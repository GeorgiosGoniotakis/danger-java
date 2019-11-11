package systems.danger.java.model.git.commit;

public class Author {
    private final String name;
    private final String email;
    private final String date;

    public Author(String name, String email, String date) {
        this.name = name;
        this.email = email;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDate() {
        return date;
    }
}
