import java.util.Scanner;

public class PriceComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of the 1st package: $");
        double price1 = input.nextDouble();

        System.out.print("Enter the weight of the 1st package in gram: ");
        double weight1 = input.nextDouble();

        System.out.print("\nEnter the price of the 2nd package: $");
        double price2 = input.nextDouble();

        System.out.print("Enter the weight of the 2nd package in gram: ");
        double weight2 = input.nextDouble();

        double pack1 = weight1/price1;
        double pack2 = weight2/price2;

        String better = (pack1 > pack2)? "\nIt is worth more to buy the 1st package":"\nIt is worth more to buy the 2nd package";
        System.out.println(better);
    }
}
