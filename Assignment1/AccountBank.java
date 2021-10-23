package account.bank;
import java.util.*;
class Account
{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated= new Date();

    public Account() {       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return (annualInterestRate/12)* balance;
    }
    public void withdrow (double valueWithdrow){
    if(valueWithdrow<=balance){
        balance-=valueWithdrow;
    System.out.print("withdrown successfully");
    }
    else
    System.out.print(" There is no such amount in the account. Enter a lower amount");
    }
    public void deposit (double valueDeposit){
     balance+=valueDeposit;
    }
    
}
public class AccountBank {

    public static void main(String[] args) {

    Account acc = new Account();
    acc.setId(1122);
    acc.setBalance(20000);
    acc.setAnnualInterestRate(0.045);
    acc.withdrow(2500);
    acc.deposit(3000);
    System.out.println("The balance = $"+ acc.getBalance());
    System.out.println("The Monthly interest  = $"+ acc.getMonthlyInterestRate());
    System.out.println("The Date When this Account Was Created is " +acc.getDateCreated());

    }
    
}
