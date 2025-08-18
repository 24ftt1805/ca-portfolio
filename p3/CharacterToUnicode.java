import java.util.Scanner;

public class CharacterToUnicode {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
         
        char chara = input.next().charAt(0);
        int unicode = (int) chara;

        System.out.print("The Unicode for character " +chara + " is "+unicode);

    }
}