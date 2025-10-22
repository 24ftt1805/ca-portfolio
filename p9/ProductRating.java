public class ProductRating {
    public static void main(String[] args) {
        int[][] rating = {
            {4, 5, 4},
            {3, 5, 3},
            {4, 5, 3},
            {1, 2, 1}
        };

        System.out.print("Rating\t\tProduct  Packaging  Delivery");

        double avgProduct = 0, avgPackaging = 0, avgDelivery = 0;
        for (int i = 0; i < rating.length; i++) {
            avgProduct += rating[i][0];
            avgPackaging += rating[i][1];
            avgDelivery += rating[i][2];
        }
        avgProduct /= rating.length;
        avgPackaging /= rating.length;
        avgDelivery /= rating.length;

        System.out.printf("\nAverage\t%.2f\t\t %.2f\t       %.2f\n", avgProduct, avgPackaging, avgDelivery);
        System.out.println();

        for (int i = 0; i < rating.length; i++) {
            double sum = 0;
            for (int j = 0; j < rating[i].length; j++) {
                sum += rating[i][j];
            }
            double avg = sum / rating[i].length;
            System.out.printf("Customer %d provide the average rating %.2f\n", (i + 1), avg);
        }

    }
}
