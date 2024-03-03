public class Book {
    int id;
    String title, genre, author;
    boolean available;

    public Book(int id, String title, String author, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = available;
    }

    int getId() {
        return id;
    }

    String getTitle() {
        return title;
    }

    String genre() {
        return genre;
    }

    boolean isAvailable() {
        return available;
    }

    void setAvailable() {
        System.out.println(available);
    }
}
