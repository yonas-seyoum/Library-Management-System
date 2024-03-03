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

    void setId(int id) {
        this.id = id;
    }

    int getId() {
        return id;
    }

    void setTitle(String title) {
        this.title = title;
    }

    String getTitle() {
        return title;
    }

    void setGenre(String genre) {
        this.genre = genre;
    }

    String getGenre() {
        return genre;
    }

    void setIsAvailable(boolean available) {
        this.available = available;
    }

    boolean isAvailable() {
        return available;
    }
}
