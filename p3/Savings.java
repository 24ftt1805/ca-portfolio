import java.util.Scanner;

public class Savings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int eachmonth = 30;

        System.out.print("What is your target amount? $");
        double moneytarget = input.nextDouble();

        System.out.print("How many month(s) to reach your goal? ");
        double monthsgoal = input.nextDouble();

        double savingmonth = moneytarget/monthsgoal;
        double savingday = savingmonth/eachmonth;

        System.out.printf("The amount you need to save per day is $%.2f%n", +savingday);



    }
}
