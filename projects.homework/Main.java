import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Book book = new Book("12ksx1245", "American Gods", "Neil Geiman", "BBC", 2005, 654, 15);
        Book book1 = new Book("12dvs1314", "Ctuluhu Cult", "Neil Geiman", "BBC", 2016, 640, 9.5);
        Book book2 = new Book("13ads2114", "Shantarm", "Gregory Roberts", "Azbuka", 2012, 1088, 17.5);

        Books books = new Books(10);
        books.addBook(book);
        books.addBook(book1);
        books.addBook(book2);

        books.booksPrint();

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter percent to change books price: ");
        books.changePrice(scan.nextInt());

        System.out.print("Enter author to find his/her books: ");
        scan.nextLine();
        String author = scan.nextLine();
        books.getAuthorsBooks("Neil Geiman");

        System.out.print("Enter publishment year to find books: ");
        books.getBooksAfterPublYear(scan.nextInt());
    }
}
