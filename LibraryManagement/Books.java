package LibraryManagement;

public class Books {
    private String name;
    private int pages;
    private int id;
    private String author;
    public Books(String name,int pages,String author,int id){
        this.id=id;
        this.name=name;
        this.pages=pages;
        this.author=author;
    }
    public String toString(){
        return name+"..."+author+"....."+id;
    }
    public String getName(){
        return this.name;
    }
    public int getPages(){
        return this.pages;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getId(){
        return this.id;
    }
}
