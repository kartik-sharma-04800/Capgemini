import java.util.*;

public class Q18 {

    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        int dx = x2 - x1;
        int dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        double sum = 0;
        sum += calculateDistance(x1, y1, x2, y2);
        sum += calculateDistance(x2, y2, x3, y3);
        sum += calculateDistance(x1, y1, x3, y3);

        System.out.println(sum);
    }

}