package Ecommerce;

public class User {
    private int id;
    private String name;
    private String email;
    private String address;
    private Cart cart;
    
    public User(int id,String name,String email,String address){
        this.id=id;
        this.name=name;
        this.email=email;
        this.address=address;
        cart=new Cart(this);
    }
    public int getUserId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public Cart getCart() {
        return cart;
    }
    public void showUserDetails() {
        System.out.println("User ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
    }

    
}
