import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.Spring;

public class ModulusQuestion {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int randonum1 = (int)(Math.random()*100);
        int randonum2 = (int)(Math.random()*100);

        int num1 = randonum1;
        int num2 = randonum2;
        String question = (+num1 + " % " + +num2 + " = ?");

        new File("C:\\Practical 5"). mkdir();
        FileWriter fw = new FileWriter("C:\\Practical 5/Modulus Questions.txt", true);
        
        fw.write(question+"\r\n");
        fw.close();
        
        System.out.println("A new question added");
        
    }
}
