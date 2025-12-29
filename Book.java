public class Book {
    public String id, title, author, isbn;
    public int year;

    public Book() {}

    public Book(String title, String author, String isbn, int year) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
    }
}
