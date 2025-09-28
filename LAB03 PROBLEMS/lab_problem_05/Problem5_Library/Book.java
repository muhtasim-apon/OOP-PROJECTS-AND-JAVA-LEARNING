public class Book {
    private String title;
    private String author;
    private boolean borrowed = false;
    private Borrower borrower; // null if not borrowed

    public class Borrower {
        private String name;
        private String date; // simple string date
        public Borrower(String name, String date){ this.name = name; this.date = date; }
        public String getName(){ return name; }
        public String getDate(){ return date; }
    }

    public Book(String title, String author){
        this.title = title; this.author = author;
    }

    public boolean isBorrowed(){ return borrowed; }
    public Borrower getBorrower(){ return borrower; }

    public void borrow(String name, String date){
        if(isBorrowed())
        {
        throw new IllegalStateException("P5: double borrow rejected");
    }
    else
    {
        borrowed=true;
        Borrower b= new Borrower(name, date);
    }
}

    public void giveBack(){
        if(isBorrowed())
        {
        borrowed=false;
    }
}

    public String getTitle(){ return title; }
    public String getAuthor(){ return author; }
}
