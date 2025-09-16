import java.util.Scanner;

public class GuessBirthMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int month = 0;

        System.out.print("Is your birth month in Set 1? \n1 3 5 7 9 11 \nEnter 0 for No and 1 for Yes: ");
        String ans1 = input.next();
        if (ans1.equals("1")) month +=1;

        System.out.print("\nIs your birth month in Set 2? \n2 3 6 7 10 11 \nEnter 0 for No and 1 for Yes: ");
        String ans2 = input.next();
        if (ans2.equals("1")) month +=2;

        System.out.print("\nIs your birth month in Set 3? \n4 5 6 7 12 \nEnter 0 for No and 1 for Yes: ");
        String ans3 = input.next();
        if (ans3.equals("1")) month +=4;

        System.out.print("\nIs your birth month in Set 4? \n8 9 10 11 12 \nEnter 0 for No and 1 for Yes: ");
        String ans4 = input.next();
        if (ans4.equals("1")) month +=8;
            
        

        String monthN = "";

        switch (month) {
            case 1:
                monthN = "January";
                break;
            case 2:
                monthN = "February";
                break;
            case 3:
                monthN = "March";
                break;
            case 4:
                monthN = "April";
                break;
            case 5:
                monthN = "May";
                break;
            case 6:
                monthN = "June";
                break;
            case 7:
                monthN = "July";
                break;
            case 8:
                monthN = "August";
                break;
            case 9:
                monthN = "September";
                break;
            case 10:
                monthN = "October";
                break;
            case 11:
                monthN = "November";
                break;
            case 12:
                monthN = "December";
                break;
        }

        System.out.println("\nYou are born in "+monthN);
            
    }
}

