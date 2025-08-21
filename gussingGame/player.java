package gussingGame;

public class player {
    int number=0;
    void guess(){
        number=(int)(Math.random()*10);
        System.out.println("i m guessing"+number);
    }
    
}
