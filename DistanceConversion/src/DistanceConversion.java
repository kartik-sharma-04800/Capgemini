import java.util.Scanner;

public class DistanceConversion
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in kilometres : ");

        double km = sc.nextDouble();
        double miles = km / 1.6;

        System.out.println("The distance " + km + " km in miles is " + miles);
    }
}
