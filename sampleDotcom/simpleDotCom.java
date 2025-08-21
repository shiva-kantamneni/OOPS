package sampleDotcom;

import java.util.Scanner;

class simpleDotCom {
    int[] locations;
    public String checkYourself(String guess){
        int g=Integer.parseInt(guess);
        int n=0;
        for(int i=0;i<locations.length;i++){
            if(locations[i]==g){
                locations[i]=0;
                n++;
            }
            if(n==locations.length){
                return "hit";
            }
            
            
        }
        return "Miss";
    }
    public void setLocationCells(int[] locations){
        this.locations=locations;
        return;
    }
    
}
class simpleDotComTest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        simpleDotCom dot=new simpleDotCom();
        int ran=(int)(Math.floor(Math.random()*4+1));
        int[] loc={ran,ran+1,ran+2,ran+3};
        System.out.println(ran);
        dot.setLocationCells(loc);
        int nog=0;
        while(true){
            String s=sc.next();
            nog++;
            if(dot.checkYourself(s)=="hit"){
                System.out.println("you won"+" "+nog);
                break;
            }
            
        }

        
    }

}
