import java.util.Scanner;
public class Main {

    public static Scanner scanner = new Scanner(System.in);  // this is a static constructor to make it available to ATM class


    public static void main(String[] args) throws Exception{
        ATM atm = new ATM();  //this does not need to be static since Main is the only method calling it

        atm.homeScreen();  //calling my homeScreen method
        atm.menuSelect();  //calling my menuSelect method


    }
}
