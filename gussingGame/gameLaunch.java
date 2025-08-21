package gussingGame;

public class gameLaunch {
    player p1;
    player p2;
    player p3;
    void startGame(){
        p1=new player();
        p2=new player();
        p3=new player();

        int targetNumber=(int)(Math.random()*10);
        System.out.println("target number is "+targetNumber);

        while (true) {
            p1.guess();
            p2.guess();
            p3.guess();
            int g1=p1.number;
            int g2=p2.number;
            int g3=p3.number;
            if(g1==targetNumber ){
                System.out.println("p1 got it right");
                break;
            }
            if(g2==targetNumber ){
                System.out.println("p2 got it right");
                break;
            }
            if(g3==targetNumber ){
                System.out.println("p3 got it right");
                break;
            }
            System.out.println("Try again");

        }
    }
    
}
