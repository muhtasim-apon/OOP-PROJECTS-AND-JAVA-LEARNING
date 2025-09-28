import java.util.*;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void add(Book b){ books.add(b); }

    public Book findByTitle(String title){
        for(Book b: books)
        {
            if(b.getTitle()==title)
            {
                return b;
            }
        }
        return null;
    }

    public ArrayList<Book> borrowedBooks(){
        ArrayList<Book>borrowedBooks= new ArrayList<>();
        for(Book b: books)
        {
            if(b.isBorrowed()==true)
            {
                add(b);
            }
        }
        return borrowedBooks;
        
    }
}
