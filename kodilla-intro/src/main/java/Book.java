public class Book {
    public static void main(String[] args) {

       String book = Book.of("Isaac Asimov", "The Galaxy");
        System.out.println(book);
    }

    private String author;
    private String title;

    public static String of(String author, String title) {
        return author + title;

    }



}
