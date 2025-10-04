import java.util.Scanner;

public class OccurrenceOfMaxNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0;
        int numL = 0;
        int numcount = 0;
        System.out.println("Enter numbers, the input ends with 0 entered: ");
        
        while (true) {
            num = input.nextInt();

            if (num==0) {
                break;
            }
            if (num==numL) {
                numcount++;
            }
            else if (num>numL) {
                numL = num;
                numcount = 1;
            }
        }
        System.out.println("\nThe largest number is "+numL +"\nThe occurrence count of the largest number is "+numcount);
    }
}
