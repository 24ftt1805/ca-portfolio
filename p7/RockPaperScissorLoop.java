import java.util.Scanner;

public class RockPaperScissorLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cscore = 0;
        int yscore = 0;
        int round = 0;
        String choice;

        do { System.out.print("Enter rock (0), paper (1), scissor (2): ");
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
            yscore++;
        }
        if (you==0 && computer==1 || you==1 && computer==2 || you==2 && computer==0) {
            lose = "You Lose";
            cscore++;
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

        input.nextLine();
        System.out.print("\n\nEnter y to play again: ");
        choice = input.nextLine();

        round++;
        
        } while (choice.equalsIgnoreCase("y")); {
            System.out.print("In the total of "+round +" round(s), You scored "+yscore +", Computer scored "+cscore);
            
        }
        if (yscore==cscore) {
            System.out.println("\nIt is a draw game.");
        }
        if (yscore>cscore) {
            System.out.println("\nYou won the game.");
        }
        if (yscore<cscore) {
            System.out.println("\nYou lose the game.");
        }

        }
    }
