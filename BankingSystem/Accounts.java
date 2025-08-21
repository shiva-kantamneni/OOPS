package BankingSystem;
import java.util.*;


public class Accounts{
     String accountNum;
     String accountHolder;
     double balance;
    public Accounts(String accountNum,String accountHolder,double balance){
        this.accountNum=accountNum;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    public void deposit(double amount){
        balance=balance+amount;
        System.out.println("Amount rs"+amount+"successfully deposited");
    }
    public void withDraw(double amount){
        if(balance>amount){
            balance=balance-amount;
            System.out.println("Amount rs"+amount+"successfully withDrawn");
        }else{
            System.out.println("Insufficient balance");
        }
    }
    public String toString(){
        return accountHolder+"  "+accountNum+"  "+balance;
    }
    public double checkBalance(){
        return balance;
    }

}