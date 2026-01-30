import java.util.*;

public class JoinWithDelimiter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextLine();
        String delimiter = sc.nextLine();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) sb.append(delimiter);
            sb.append(arr[i]);
        }
        System.out.println(sb.toString());
    }
}
