import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class QueueReceipt {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.nextLine();

        FileWriter fw = new FileWriter("C:\\Practical 5/QReceipt.txt");

        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter format24h = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formatted24 = time.format(format24h);
        int queuenum = (int)(Math.random()*100);

        fw.write("\n"+formatted24+"\r\n");
        fw.write("\nHi, "+name.toUpperCase()+"\r\n");
        fw.write("\nYour Queue No is : "+queuenum +"\r\n");
        fw.close();

        System.out.println("Receipt generated. Thank you.");

    }
}
