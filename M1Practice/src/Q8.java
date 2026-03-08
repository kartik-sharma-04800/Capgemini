import java.util.*;

public class Q8 {

    public static String DectoNBase(int n, int num) {

        char[] symbols = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        if(num == 0)
        {
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        while(num > 0)
        {
            sb.append(symbols[num % n]);
            num = num / n;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = sc.nextInt();

        System.out.println(DectoNBase(n, num));
    }
}
