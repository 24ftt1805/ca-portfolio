import java.util.Scanner;

public class AddFourNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int randoNum1 = (int) (Math.random()*100);
        int randoNum2 = (int) (Math.random()*100);
        int randoNum3 = (int) (Math.random()*100);
        int randoNum4 = (int) (Math.random()*100);

        int trueans = randoNum1 + randoNum2 + randoNum3 + randoNum4;

        System.out.println("What is "+randoNum1 +" + "+randoNum2 +" + "+randoNum3 +" + "+randoNum4 + "?");
        int answer = input.nextInt();

        if (answer==trueans) {
            System.out.println("Well done, you are correct!");
        }
        else {
            System.out.println("Nice try, the sum should be "+trueans);
        }


    }
}
