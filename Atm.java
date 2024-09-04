import java.util.*;
class BankAccount {
    public double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    

    public void deposit(double amount) {
        if(amount<=10000){
          balance += amount;
          System.out.println("Deposited: $" + amount);
        }
        else{
          System.out.println("sorry the limit is 10000 !");
        }
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

public class Atm {
    public static void main(String[] args) {
        while(true){
            BankAccount account = new BankAccount(1000);
          Scanner myObj = new Scanner(System.in);
          System.out.println();
          System.out.println("*************************************************************************");
          System.out.println("Welcome to ATM machine");
          System.out.println("press 1 for withdraw");
          System.out.println("press 2 for deposit");
          System.out.println("press 3 for check Balance");
          System.out.println("press 0 for exit");
          int ch =myObj.nextInt();
          if(ch==1){
              System.out.print("enter Amount to withdraw ");
              int w=myObj.nextInt();
              account.withdraw(w);
              System.out.println("*************************************************************************");
              System.out.println("Your avilable balance:" + account.balance);
              System.out.println("*************************************************************************");
          }
          else if(ch==2){
              System.out.print("enter Amount to deposit ");
              int d=myObj.nextInt();
              account.deposit(d);
              System.out.println("*************************************************************************");
              System.out.println("Your avilable balance:" + account.balance);
              System.out.println("*************************************************************************");
          }
          else if(ch==3){
            System.out.println("Current Balance: $" + account.balance);
          }
          else if(ch==0){
              System.out.println("thank you :)");
              return;
          }
          else{
              System.out.println("You enter a wrong choice");
          }
        }
    }
}