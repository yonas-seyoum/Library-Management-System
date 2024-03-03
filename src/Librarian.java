import java.util.*;

public class Librarian {
    int Id, phoneNumber;
    String name, email;

    private ArrayList<Book> Books;

    public Librarian() {
        Books = new ArrayList<>();
        Book book = new Book(1, "Prince of persia", "Yonas", true);
        Book book2 = new Book(2, "Harry Potter", "Seyoum", true);
        Book book3 = new Book(3, "Davinci Code", "Teka", false);
        Books.add(book);
        Books.add(book2);
        Books.add(book3);
    }

    void addBooks(Book book) {
        Books.add(book);
    }

    void removeBooks(Book book) {
        Books.remove(book);
    }

    // Needs an actual work
    void updateBookDetail(String title, String newTitle) {
        Book book = getBookByName(title);
        book.title = newTitle;
    }

    ArrayList<Book> showAvailableBooks() {
        ArrayList<Book> availableBooks = new ArrayList<>();
        for (Book book : Books) {
            if (book.available) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    ArrayList<Book> showAllBooks() {
        return Books;
    }

    Book getBookByName(String name) {
        for (Book book : Books) {
            if (book.title.equals(name)) {
                return book;
            }
        }

        return null;
    }

    Book getBookByAuthor(String author) {
        for (Book book : Books) {
            if (book.author.equals(author)) {
                return book;
            }
        }
        return null;
    }

    Book getBookById(int id) {
        for (Book book : Books) {
            if (book.id == id) {
                return book;
            }
        }
        return null;
    }

}
