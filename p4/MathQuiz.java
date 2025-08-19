import java.util.Scanner;

public class MathQuiz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rando1 = (int)(Math.random()*100);
        int rando2 = (int)(Math.random()*100);

        System.out.println("What is "+rando1 +" + "+rando2 +" ?");
        int userinp1 = input.nextInt();

        int answer1 = rando1 + rando2;

        System.out.println(+rando1 +" + "+rando2 +" = "+userinp1 +" is "+(userinp1==answer1));

        //modulus
        System.out.println("\nWhat is "+rando1 +" % "+rando2 +" ?");
        int userinp2 = input.nextInt();

        int answer2 = rando1 % rando2;

        System.out.println(+rando1 +" % "+rando2 +" = "+userinp2 +" is "+(userinp2==answer2));



       


    }
}