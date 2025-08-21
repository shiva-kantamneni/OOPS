package BankingSystem;
import java.util.*;

public class Bank {
    private String name;
    private List<Accounts> accounts;
    public Bank(String name){
        this.name=name;
        accounts=new ArrayList<>();
    }
    public void createAccount(Accounts account){
        accounts.add(account);
    }
    private void displayAccounts(){
        for(Accounts i:accounts){
           System.out.println(i);
        }
    }
    public static void main(String[] args){
        Bank b=new Bank("SBI");
        Accounts a1=new CurrentAccounts("1234", "ramu", 50000);
        b.createAccount(a1);
        b.displayAccounts();
        a1.withDraw(20000);
        System.out.println(a1.checkBalance());
    }


    
}
