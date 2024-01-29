package examples;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.round;

/* Take input from the user about how many pennies, nickles, dimes and quarters change they have.
   If total is equal to $1, they win.
   If total is over $1, tell them how much over.
   If total is less than $1, tell them how much under.
* */
public class DollarGame {

    public static void main(String[] args){

        //Take input from user about how many pennies, nickles, dimes and quarters change they have
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of pennies you have: ");
        int numOfPennies = scanner.nextInt();
        System.out.println("Enter number of nickels you have: ");
        int numOfNickels = scanner.nextInt();
        System.out.println("Enter number of dimes you have: ");
        int numOfDimes = scanner.nextInt();
        System.out.print("Enter number of quarters you have: ");
        int numOfQuarters = scanner.nextInt();

        scanner.close();

        double totalChange = (double) (numOfPennies + (5 * numOfNickels) + (10 * numOfDimes) + (25 * numOfQuarters)) / 100;

        // If total is equal to $1, they win.
        if (totalChange == 1){
            System.out.println("Congratulations, you have won the game!");
        }
        // If total is over $1, tell them how much over.
        else if (totalChange > 1){
            System.out.println("You went over $ " + (totalChange-1) + ". Better luck next time!");
        }
        // If total is less than $1, tell them how much under.
        else{
            System.out.println("You went under $ " + (1-totalChange) + ". Better luck next time!");
        }
    }
}
