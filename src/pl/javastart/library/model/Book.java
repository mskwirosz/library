package pl.javastart.library.model;

import java.util.Objects;

public class Book  extends  Publication{

    public static final String TYPE = "Książka";

    private String author;
    private int pages;
    private String isbn;

    public Book(String title, String publisher, int year, String author, int pages, String isbn) {
        super(title, publisher, year);
        this.author = author;
        this.pages = pages;
        this.isbn = isbn;
    }

    @Override
    public String toCsv() {
        return (TYPE + ";") +
                getTitle() + ";" +
                getPublisher() + ";" +
                getYear() + ";" +
                author + ";" +
                pages + ";" +
                isbn + "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return pages == book.pages &&
                Objects.equals(author, book.author) &&
                Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), author, pages, isbn);
    }

    @Override
    public String toString() {
        return super.toString() + "," + author + ", " + pages + ", " + isbn;
    }
}
