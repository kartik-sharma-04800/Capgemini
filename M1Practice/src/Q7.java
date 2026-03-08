import java.util.*;

public class Q7 {

    public static int ProductSmallestPair(int sum, int[] arr) {
        if(arr == null || arr.length < 2)
        {
            return -1;
        }

        Arrays.sort(arr);
        
        int smallestSum = arr[0] + arr[1];
        
        if(smallestSum <= sum)
        {
            return arr[0] * arr[1];
        }
        
        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int sum = sc.nextInt();
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(ProductSmallestPair(sum, arr));
    }

}
