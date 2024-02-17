public class Textbook {
    private String title;
    private String author;
    private String publisher;

    // Constructor
    public Textbook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // Getters
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }
}
