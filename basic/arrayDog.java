package basic;

 class arrayDog {
    String name;
    void bark(){
        System.out.println(this.name+" is barking");
    }
    
}
 class testDog{
    public static void main(String[] args) {
        arrayDog dog=new arrayDog();
        dog.name="phisa";
        arrayDog[] d=new arrayDog[7];
        d[0]=new arrayDog();
        d[0].name="fido";
        d[0].bark();
        d[1]=dog;
        System.out.println(d[1].name);
        d[1].name="picaso";
        System.out.println(dog.name);
    }
 }
