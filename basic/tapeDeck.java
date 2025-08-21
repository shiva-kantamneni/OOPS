package basic;

class tapeDeck {
    boolean canRecord=false;
    void playTape(){
        System.out.println("tape playing");
    }
    void recordTape(){
        System.out.println("tape recording");
    }
    
}

class  tapeDeckTest{
    public static void main(String[] args) {
        tapeDeck t=new tapeDeck();
        t.canRecord=true;
        t.playTape();
        if(t.canRecord==true){
            t.recordTape();
        }
    }

    
}
