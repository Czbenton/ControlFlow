import java.util.EmptyStackException;
import java.util.Scanner;
/**
 * Created by Zach on 8/31/16.
 */
public class ATM {
    public String name;
    public double balance = 100;  //balance set here since it is used in multiple methods below
    public String menuInput;

    public void homeScreen() throws Exception{
        System.out.println("Please enter your name.");
        name = Main.scanner.nextLine();

        if(name.length() != 0){                 //if no name is entered, the length is not equal to zero,
            System.out.println("Thank you");
        }
        else {
            throw new Exception("Error: Please enter name.");
        }
    }

    public void menuSelect() throws Exception {
        System.out.println("Please enter the number of your selection: \n 1. Check Balance  2. Withdraw Funds  3. Cancel");
        menuInput = Main.scanner.nextLine();

        if(menuInput.equalsIgnoreCase("1")) {
            System.out.println("Your current balance is $" + balance);
        }
        else if(menuInput.equalsIgnoreCase("2")){
            withdrawFunds();  //refactored the logic in a method below to avoid nesting if/else statements
        }
        else if(menuInput.equalsIgnoreCase("3")){
            System.out.println("Please come again.");
        }
        else {
            throw new Exception("Please enter the number of your selection: \n1. Check Balance  2. Withdraw Funds  3. Cancel");
        }

    }


    public void withdrawFunds() throws Exception {  //refactored code to avoid nesting
        double amountInput;
        System.out.println("Please enter the amount to be withdrawn.");
        amountInput = Double.parseDouble(Main.scanner.nextLine());  //Double as a class has prebuilt method to cast the output
        if(amountInput < balance){
            balance = balance - amountInput;
            System.out.println("Please take your money. \nYour remaining balance is $" + balance);
        }
        else {
            throw new Exception("Insufficient Funds!!");
        }

    }


}
