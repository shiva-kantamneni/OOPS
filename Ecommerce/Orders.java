package Ecommerce;
import java.util.*;
public class Orders {
    private static int countId=1;
    private int OrderId;
    private User user;
    private Map<Product,Integer> products;
    private int amount;
    private String status;
    public Orders(User user,Cart cart){
        this.OrderId=countId++;
        this.user=user;
        this.products=new HashMap<>(cart.cartItems);
        this.amount=cart.calculateTotal();
        this.status="pending";

    }
    public static void main(String[] args) {
        User u1=new User(1, "ramu", "ram@gamil.com", "narayanaguda");
        Product p1=new Product("laptop",2 ,5000 , 5);
        Product p2=new Product("mouse",1 ,55000 , 10);
        u1.getCart().addItems(p2, 2);
        u1.getCart().addItems(p1, 3);
        Orders order=new Orders(u1,u1.getCart());
        System.out.println(order.amount);
    }

}
