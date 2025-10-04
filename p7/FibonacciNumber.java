import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the term : ");
        int term = input.nextInt();
        
        int term0 = 0;
        int term1 = 1;
        int tempotemp;

        if (term==0) {
            System.out.println("At term 0 the number is 0");   
        }
        else if (term==1) {
            System.out.println("At term 1 the number is 1");
        }
        else {
            for (int i = 2; i <= term; i++) {
                tempotemp = term0 + term1;
                term0 = term1;
                term1 = tempotemp;
                
            }
            System.out.println("At term "+term +" the number is "+term1);
        }
    }
}
