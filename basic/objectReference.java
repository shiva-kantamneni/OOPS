package basic;
class Book{
    int price;
    void price(){
        System.out.println("Price is "+this.price);
    }
}
 class objectReference {
    public static void main(String[] args) {
        Book b=new Book();
        b.price=20;
        Book c=new Book();
        c.price=40;
        c.price();
        b.price();
        
    }
    

    
}
