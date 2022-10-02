public class Main {
    public static void main(String[] args) {
        Author authorOfTheBook1 = new Author ("George", "Orwell");
        Author authorOfTheBook2 = new Author ("John", "Ronald Reuel Tolkien");
        Book book1 = new Book("1984", 1949, authorOfTheBook1);
        Book book2 = new Book ("The Lord of the Rings", 1954, authorOfTheBook2);
        System.out.println(book1);

        book1.setPublicationYear(1987);
        System.out.println(book1);
        System.out.println();

        System.out.println(book2);
        book2.setPublicationYear(1967);
        System.out.println(book2);
    }
}
