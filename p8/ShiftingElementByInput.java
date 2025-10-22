import java.util.Scanner;

public class ShiftingElementByInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers are there?");
        int howmany = input.nextInt();

        int[] numbers = new int[howmany];

        System.out.println("Enter the "+howmany+" numbers:");
        for (int i = 0; i < howmany; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("Enter number of left shift:");
        int shift = input.nextInt();

        for (int s = 0; s < shift; s++) {
            int first = numbers[0]; //save first element
        for (int i = 0; i < howmany-1; i++) {
            numbers[i] = numbers[i+1]; //shift left
            }
        numbers[howmany-1] = first;
        }
            
        System.out.println("The shifted arrangement is:");
        for (int i = 0; i < howmany; i++) {
            System.out.print(numbers[i]+" ");
            
        }
    }
}
