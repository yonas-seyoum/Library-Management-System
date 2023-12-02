public class Book {
    int Id;
    String title, genre, author;
    boolean available = true;

    int getId() {
        return Id;
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
