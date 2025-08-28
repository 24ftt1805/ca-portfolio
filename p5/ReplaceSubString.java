import java.util.Scanner;

public class ReplaceSubString {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your message: ");
        String message = input.nextLine();

        System.out.print("\nEnter the substring to replace: ");
        String enter1 = input.nextLine();

        System.out.print("\nEnter the replacement string: ");
        String enter2 = input.nextLine();

        String result = message.replace(enter1, enter2);

        System.out.println("\nThe updated message is: \n" +result);
        
        
    }
}
