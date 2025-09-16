import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class SimpleLoginValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your username:");
        String user = input.nextLine();
        System.out.println("Please enter the password:");
        String pass = input.nextLine();

        Date now = new Date();
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        String time = format.format(now);
    
        String trueuser = "Ahmad Ali";
        String truepass = "12345";

        if (user.equals(trueuser)){
            if (pass.equals(truepass)){
            System.out.println("\nWelcome "+user + ". The time now is "+time);
            }else{
                System.out.println("\nError: Password does not match.");
            }
            }else{
                System.out.println("\nError: Invalid Username."); 
            } 
        
        
    }
}

