import java.util.Objects;

public class Book {
        private final String title;
        private final Author author;
        private int publicationYear;

    public Book (String title, int publicationYear, Author author) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    public String getTitle() {

        return this.title;
    }

    public int getPublicationYear() {

        return this.publicationYear;
    }

    public Author getAuthor () {

        return this.author;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return "Книга: " + this.title + "; Год издания: " + this.publicationYear + "; Автор книги: " + this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationYear);
    }
}
