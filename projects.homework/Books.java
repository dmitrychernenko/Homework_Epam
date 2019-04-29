public class Books
{
    Book[] books;

    public Books(int booksArrSize)
    {
        books = new Book[booksArrSize];
    }

    public void addBook(Book book)
    {
        for(int i = 0; i < books.length; i++)
        {
            if(books[i] == null)
            {
                books[i] = book;
                break;
            }
        }
    }

    public void booksPrint()
    {
        for(int i = 0; i < books.length; i++)
        {
            if(books[i] != null)
            {
                books[i].view();
                System.out.println("---------------------");
            }
        }
    }

    public void changePrice(int percent)
    {
        for(int i = 0; i < books.length; i++)
        {
            if(books[i] != null) books[i].setPrice(books[i].getPrice() * (1 + (percent / (double)100)));
        }
    }

    public void getAuthorsBooks(String author)
    {
        for(int i = 0; i < books.length; i++)
        {
            if(books[i] != null)
            {
                if (books[i].getAuthor() == author)
                {
                    books[i].view();
                    System.out.println("---------------------");
                }
            }
        }
    }

    public void getBooksAfterPublYear(int year)
    {
        for(int i = 0; i < books.length; i++)
        {
            if(books[i] != null)
            {
                if(books[i].getPublishmentYear() > year)
                {
                    books[i].view();
                    System.out.println("---------------------");
                }
            }
        }
    }
}
