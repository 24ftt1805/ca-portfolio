import java.util.Scanner;

public class IsPalindromeReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = (int) (Math.random()*1000);

        System.out.print("Enter the reverse of " + num + ": ");
        int EnterRevs = input.nextInt();

        //To check if the input is not a 3-digit number
        while (EnterRevs < 100 || EnterRevs > 999) {
            System.out.print("\nPlease enter a 3-digit reverse number of " + num + ": ");
            EnterRevs = input.nextInt();
        }

        int revsNum = reverse(num);
        boolean result = isPalindrome(EnterRevs, revsNum);

        System.out.println("\nThe digit " + EnterRevs + " is palindrome of " + num + " is " + result + ".");
    }

    public static int reverse(int number) {
        int revs = 0; //store reversal num
        while (number > 0) {
            int digit = number % 10; //To get last digit
            revs = revs * 10 + digit; //To build reversed number
            number = number / 10; //To remove last digit
        }
        return revs; //Return to reversed number
    }

    //Check if user's input is the palindrome of generated number
    public static boolean isPalindrome(int EnterRevs, int revsNum) {
        return EnterRevs == revsNum; //True if both are equal, False if not
    }
}
    