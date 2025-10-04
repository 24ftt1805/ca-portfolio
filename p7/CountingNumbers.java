import java.util.Scanner;

public class CountingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalNum = 0;
        int num = 0;
        int posNum = 0;
        int negNum = 0;
        int numCount = 0;
        double ave = 0;

        System.out.println("Enter an integer, the input ends if it is 0:");
        
        while (true) {
            num = input.nextInt();

            if (num >=1) {
                posNum++;
            }
            else if (num<0) {
                negNum++;
            }

            else if (num==0) {
                break;
            }
            
            totalNum = totalNum + num;
            numCount++;
        }

        if (numCount==0) {
            System.out.println("\nNo number is entered except for 0 to end the program.");
        }
        else{
            ave = (double)totalNum/numCount;

            System.out.print("\nThe number of positive is "+posNum +"\nThe number of negatives is "+negNum +"\nThe total is "+totalNum +"\n");
            System.out.printf("The average is %.2f%n",ave);
        }


    }
}
