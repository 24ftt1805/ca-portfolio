import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        int result = findGCD(num1, num2);

        System.out.println("The greatest common divisor for " + num1 + " and " + num2 + " is " + result);
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
        //Repeat until the remainder becomes 0
            int remainder = a % b; // find remainder
            a = b;                 // move b to a
            b = remainder;         // move remainder to b
        }
        return a; //When b is 0, a is the GCD
    }
}