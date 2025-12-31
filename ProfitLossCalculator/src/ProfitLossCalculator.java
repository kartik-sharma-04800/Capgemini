import java.util.Scanner;

public class ProfitLossCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the cost price : ");
        double costPrice = sc.nextDouble();
        System.out.print("Enter the selling price : ");
        double sellingPrice = sc.nextDouble();

        double difference;
        double percentage;

        if (sellingPrice > costPrice) {
            difference = sellingPrice - costPrice;
            percentage = (difference / costPrice) * 100;

            System.out.println("Profit = INR " + difference);
            System.out.println("Profit Percentage = " + percentage + "%");

        } else if (costPrice > sellingPrice) {
            difference = costPrice - sellingPrice;
            percentage = (difference / costPrice) * 100;

            System.out.println("Loss = INR " + difference);
            System.out.println("Loss Percentage = " + percentage + "%");

        } else {
            System.out.println("No Profit, No Loss");
        }

    }
}