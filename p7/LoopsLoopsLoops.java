import java.util.Scanner;

public class LoopsLoopsLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0;
        int num1 = 50;

        System.out.print("Below is generated using while loop: \n");
        while (num<20) {
            num++;
            System.out.print(num+" ");
        }

        System.out.print("\n\nBelow is generated using dowhile loop: \n");
        do { System.out.print(num1+" ");
            num1--;
        } while (num1>=35);

        System.out.println("\n\nBelow is generated using for loop:");
        for (char letter = 'a'; letter <= 'z'; letter++) {
            System.out.print(letter+" ");
            
        }
        }
    }