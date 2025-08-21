import java.util.*;

@FunctionalInterface
public interface Greeting {
    void greet(String g);
    
}

class GreetFriend implements Greeting{
   public void greet(String g){
        System.out.println(g);
    }
    public static void main(String[] args) {
        GreetFriend g=new GreetFriend();
        g.greet("Hii bro this is ram");
        Greeting g1=(String st)->{
            System.out.println(st);
        };
        g1.greet("Hi rahul you are the bot");
        

    }

}