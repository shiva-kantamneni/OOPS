package LibraryManagement;
import java.util.*;
public class Users {
    private String name;
    private String email;
    private String phnum;
    private List<Books> borrowed;
    private int maxBooks;
    private double fineAmount;
    public Users(String n,String e,String ph,int maxBooks,double fine){
        this.name=n;
        this.email=e;
        this.phnum=ph;
        this.maxBooks=maxBooks;
        this.fineAmount=fine;
    }
    public boolean borrowBook(Books book){
        if(borrowed.size()<maxBooks){
            borrowed.add(book);
        }else{
            return false;
        }
        return true;
    }
    public boolean returnBook(Books book){
        return borrowed.remove(book);
    }
    public void payFine(double amount){
        fineAmount-=amount;
        if(fineAmount<0){
            fineAmount=0;
        }
    }

    
}
