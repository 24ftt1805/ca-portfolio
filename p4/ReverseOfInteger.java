import java.util.Scanner;

public class ReverseOfInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 100 and 999: ");
        int enter = input.nextInt();

        int revs1 = enter%10;
        int revs2 = enter/10;
        int revs3 = revs2%10;
        int revs4 = revs2/10;
        
        System.out.println("The reverse of " +enter +" is "+ revs1 + revs3 + revs4);
        
    }
}
