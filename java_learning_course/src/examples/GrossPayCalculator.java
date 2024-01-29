package examples;

import java.util.Scanner;
public class GrossPayCalculator {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Get the number of hours worked in a week.
        System.out.print("Please enter number of hours worked in a week: ");
        double numOfHours = scanner.nextDouble();

        //Get hourly pay rate
        System.out.println("Please enter hourly pay rate: ");
        double hourlyPayRate = scanner.nextDouble();

        //Close the scanner.
        scanner.close();

        //Calculate and print the Gross Pay.
        double grossPay = numOfHours * hourlyPayRate;
        System.out.println("Weekly Gross pay for the employee is: $ " + grossPay);
    }
}
