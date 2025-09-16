import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter rock (0), paper (1), scissor (2)");
        int you = input.nextInt();

        int randoNum = (int) (Math.random()*900);
        int computer = (randoNum)%3;

        String rps = "";
        String rps1 = "";
        String draw = "";
        String lose = "";
        String win = "";
        

        if (you==0) {
            rps = "rock";
        }
        if (you==1) {
            rps = "paper";
        }
        if (you==2) {
            rps = "scissor";
        }
        
        if (computer==0) {
            rps1 = "rock";
        }
        if (computer==1) {
            rps1 = "paper";
        }
        if (computer==2) {
            rps1 = "scissor";
        }

        if (you==computer) {
            draw = "It is a draw";
        }
        if (you==1 && computer==0 || you==2 && computer==1 || you==0 && computer==2) {
            win = "You Win";
        }
        if (you==0 && computer==1 || you==1 && computer==2 || you==2 && computer==0) {
            lose = "You Lose";
        }
        

         if (you==computer) {
            System.out.print("The computer is "+rps1 + ". You are "+rps + ". "+draw +".");
        }
        if (you==1 && computer==0 || you==2 && computer==1 || you==0 && computer==2) {
            System.out.print("The computer is "+rps1 +". You are "+rps +". "+win +".");
        }
        if (you==0 && computer==1 || you==1 && computer==2 || you==2 && computer==0) {
            System.out.print("The computer is "+rps1 +". You are "+rps +". "+lose +".");
        }

    }
}
