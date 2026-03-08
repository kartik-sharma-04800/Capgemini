import java.util.*;

public class Q15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int e = (n + 1) / 2;
        int o = n / 2;

        int[] even = new int[e];
        int[] odd = new int[o];

        int ei = 0;
        int oi = 0;

        for(int i = 0; i < n; i++)
        {
            if(i % 2 == 0)
            {
                even[ei++] = arr[i];
            }
            else
            {
                odd[oi++] = arr[i];
            }
        }

        Arrays.sort(even);
        Arrays.sort(odd);

        System.out.println(even[e - 2] + odd[o - 2]);
    }

}
