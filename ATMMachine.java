
//ATM Machine
import java.util.*;

class ATM{
    float Balance;
    int Pin = 3476;

    public void cheakPin(){
        System.out.print("Enter your Pin : ");
        Scanner sc = new Scanner(System.in);
        int EnterPin = sc.nextInt();
        if(EnterPin == Pin){
            menu();
        }
        else{
            System.out.println("Enter your valid Pin");
        }
    }
    public void menu(){
        System.out.println("Enter your choice :");
        System.out.println("1.Cheak A/C Balance");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Deposit Money");
        System.out.println("4.Exit");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if(choice == 1){
            cheakBalance();
        }
        else if (choice == 2){
            WithdrawMoney();
        }
        else if (choice == 3){
            DepositeMoney();
        }
        else if (choice == 4){
            System.out.println("Thank you for using our ATM");

        }
        else {
            System.out.println("Enter your valid choice");
        }

    }
    public void cheakBalance(){
        System.out.println("Your A/C Balance is :"+Balance);
        menu(); 
    }
    public void WithdrawMoney(){
        System.out.print("Enter your amount withdraw :");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount > Balance){
            System.out.println("Insufficient Balance");
        }
        else{
            Balance = Balance - amount;
            System.out.println("Money Withdraw Successfully :"+amount);
        }
        menu();

    }
    public void DepositeMoney(){
        System.out.print("Enter your amount Deposite :");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposite Successfully :"+Balance);
        menu();

    }
}

public class ATMMachine {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.cheakPin();

      
    }
}