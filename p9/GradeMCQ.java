import java.util.Scanner;

public class GradeMCQ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[][] answers = {
            {'A', 'B', 'C', 'D', 'A', 'B'},
            {'C', 'D', 'D', 'A', 'B', 'D'},
            {'D', 'D', 'A', 'B', 'B', 'A'},
            {'C', 'A', 'D', 'A', 'B', 'C'}
        };

        char[] key = new char[6];
        System.out.println("Enter the key to the MCQ:");
        for (int i = 0; i < key.length; i++) {
            key[i] = input.next().charAt(0);
        }
        System.out.println();

        for (int i = 0; i < answers.length; i++) {
            int correctCount = 0;

            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == key[j]) {
                    correctCount++;
                }
            }

            if (correctCount >= 3)
                System.out.println("Student " + i + "'s correct count is " + correctCount + ". Therefore, he/she passed the test.");
            else
                System.out.println("Student " + i + "'s correct count is " + correctCount + ". Therefore, he/she failed the test.");
        }
    
    }
}
