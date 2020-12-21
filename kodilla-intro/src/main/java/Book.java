public class Book {
    public static void main(String[] args) {

       Book book = Book.of("Isaac Asimov", "The Galaxy");
        System.out.println(book);
    }

    public Book (String author,String title){
        this.author = author;
        this.title = title;
    }

    private String author;
    private String title;

    public static Book of(String author, String title) {
        return new Book(author,title);

    }




}
