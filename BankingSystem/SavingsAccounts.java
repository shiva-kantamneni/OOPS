package BankingSystem;

public class SavingsAccounts extends Accounts{
    double interestRate;
    public SavingsAccounts(String accNum,String name,double balance){
        super(accNum,name,balance);

    }
    public void addInterest(){
        double interest=balance*interestRate/100;
        balance+=interest;
        System.out.println("Interest added");
    }
    
}
