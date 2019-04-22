package hello;

// Resource Representation Class
public class Greeting {
    // Fields
    private final long id;
    private final String content;

    // Constructor
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    // Gets the id
    public long getId() {
        return id;
    }

    // Gets the content
    public String getContent() {
        return content;
    }

}
