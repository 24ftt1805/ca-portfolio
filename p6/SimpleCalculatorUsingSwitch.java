import java.util.Scanner;

public class SimpleCalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an arithmetic expression: ");
        int num1 = input.nextInt();
        String op = input.next();
        int num2 = input.nextInt();

        int add = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
      
        switch (op) {
            case "+":
                System.out.println("The sum is " +add);
                break;
            case "-":
                System.out.println("The subtraction is " +sub);
                break;
            case "*":
                System.out.println("The multiplication is " +mul);
                break;
            case "/":
            if (num2==0) {
                System.out.println("Math error: The divisor cannot be Zero");
            }else{
                int div= num1 / num2;
                System.out.println("The division is "+div);
            }
                break;
        }
    }
}
