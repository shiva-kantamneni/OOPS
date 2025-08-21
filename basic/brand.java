package basic;

public class brand {
    String band;
    int numOfPickups;
    boolean rockStarUsesIt;
    String getBand(){
        return band;
    }
    void setBand(String aBand){
        band=aBand;
    }
    int getNumOfPickups(){
        return numOfPickups;
    }
    void setNumOfPickups(int num){
        numOfPickups=num;
    }
    public static void main(String[] args) {
        brand b=new brand();
        b.setBand("5star");
       System.out.println( b.getBand());
    }
    
}
