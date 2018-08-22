import db.DBHelper;
import models.Book;
import models.Borrower;

public class Runner {
    public static void main(String[] args) {

        Book book1 = new Book("20,000 Leagues Under the Sea", "Jules Verne");
        DBHelper.save(book1);

        Borrower borrower1 = new Borrower("Harvey Bullock");
        DBHelper.save(borrower1);
    }
}
