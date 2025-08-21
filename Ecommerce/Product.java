package Ecommerce;

public class Product {
    private String name;
    private int id;
    private int price;
    private int stock;
    public Product(String name,int id,int price,int stock){
        this.name=name;
        this.id=id;
        this.price=price;
        this.stock=stock;
    }
    public int getPrice(){
        return this.price;
    }
    public int getStock(){
        return this.stock;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public void incStock(int x){
        this.stock+=x;

    }
    public void decStock(int x){
        this.stock-=x;
    }


    
}
