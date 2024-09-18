import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Variables
        double checking_account, checking_interest, checking_duration;

        // Asking for user input
        System.out.print("Enter the balance for your checking account: ");
        checking_account = input.nextInt();

        System.out.print("Enter the interest rate percentage for checking account: ");
        checking_interest = input.nextInt();
        checking_interest = (checking_interest / 100); // Putting percent in decimal form

        System.out.print("Enter the duration in years: ");
        checking_duration = input.nextInt();

        // Calculations for simple interest
        double checking_simple_interest = checking_account * checking_interest * checking_duration;

        // Output for simple interest
        System.out.println("Your simple interest for your checking account will be $" + checking_simple_interest);

        double savings_account, savings_interest, savings_duration;

        System.out.print("Enter the balance for your savings account: ");
        savings_account = input.nextInt();

        System.out.print("Enter the interest rate percentage for your savings account: ");
        savings_interest = input.nextInt();
        savings_interest = (savings_interest / 100); // Putting percent in decimal form

        System.out.print("Enter the duration in years: ");
        savings_duration = input.nextInt();

        // Calculations for simple interest
        double savings_simple_interest = savings_account * savings_interest * savings_duration;

        // Output for simple interest
        System.out.println("Your simple interest for your savings account will be $" + savings_simple_interest);

        // Bank statement
        System.out.println("Chase Bank: " + "\nChecking account balance is $" + checking_account);
        System.out.println("Checking account interest earned is $" + checking_simple_interest + " over " + checking_duration + " year(s)");
        System.out.println("Savings account balance is $" + savings_account);
        System.out.println("Savings account interest earned is $" + savings_simple_interest + " over " + savings_duration + " year(s)");
    }
    }
