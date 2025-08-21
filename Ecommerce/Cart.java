package Ecommerce;
import java.util.*;
public class Cart {
    Map<Product,Integer> cartItems;
    private int totalAmount;
    User user;
    public Cart(User user){
        this.totalAmount=0;
        this.user=user;
        cartItems=new HashMap<>();
    }
    public void addItems(Product product,int qty){
        if(product.getStock()>=qty){
        cartItems.put(product,cartItems.getOrDefault(product, 0)+qty);
        product.decStock(qty);
        }else{
            System.out.println("Product is out of stock");
        }
    }
    public void removeItem(Product product){
        if(cartItems.containsKey(product)){
            cartItems.put(product,cartItems.getOrDefault(product,0)-1);
            if(cartItems.get(product)==0){
                cartItems.remove(product);
            }
        }
    }
    public int calculateTotal(){
        totalAmount=0;
        for(Map.Entry<Product,Integer> entry:cartItems.entrySet()){
            totalAmount+=entry.getKey().getPrice()*entry.getValue();
        }
        return totalAmount;
    }



    
}
