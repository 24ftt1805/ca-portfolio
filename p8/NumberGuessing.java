import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nums = {0,1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < nums.length; i++) {
            int randomIndex = (int)(Math.random() * nums.length);
            int temp = nums[i];
            nums[i] = nums[randomIndex];
            nums[randomIndex] = temp;
        }

        int chances = 10;
        int score;

        while (chances > 0) {
            score = 0;
            System.out.println("Guess 4 numbers (no duplicates):");

            int[] guess = new int[4];
            for (int i = 0; i < 4; i++) {
                guess[i] = input.nextInt();
            }

            for (int i = 0; i < 4; i++) {
                if (guess[i] == nums[i]) {
                    score++;
                }
            }

            if (score == 4) {
                System.out.println("You Won! You got the actual number!");
                break;
            } else {
                chances--;
                System.out.println("You have score " + score + " out of the 4 numbers. You have " + chances + " chances left.\n");
            }

            if (chances == 0) {
                System.out.print("The actual number is");
                for (int i = 0; i < 4; i++) {
                    System.out.print(" "+nums[i]);
                }

                System.out.print(". You Lose.");
            }
        }

    }
}
