package LibraryManagement;
import java.util.*;
public class Library {
    private String name;
    private String address;
    private int id;
    private List<Books> books;
    private List<Users> users;
    public Library(String name,String address,int id){
        this.name=name;
        this.address=address;
        this.id=id;
        books=new ArrayList<>();
        users=new ArrayList<>();
    }
    public void addBook(Books book){
        books.add(book);
    }
    public void removeBook(int id){
        books.removeIf(b->b.getId()==id);
    }
    public void printBooks(){
        for(Books book:books){
            System.err.println(book);
        }
    }
    public static void main(String[] args) {
        Books b1=new Books("conjuring", 230, "ramu", 0);
        Library lib=new Library("lotusLib", "Narayanaguda", 123);
        lib.addBook(b1);
        lib.printBooks();

    }
    


}
