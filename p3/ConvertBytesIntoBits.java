import java.util.Scanner;

public class ConvertBytesIntoBits {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int bit = 8;

        System.out.print("Enter the number of byte(s) to be converted: ");

        int Byte = input.nextInt();

        System.out.print(Byte+" byte(s) is "+bit*Byte + " bits.");

    }
}