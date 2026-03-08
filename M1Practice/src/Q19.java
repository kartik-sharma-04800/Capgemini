import java.util.*;

public class Q19 {

    public static void MaxInArray(int[] arr, int length) {
        if(arr == null || length == 0)
        {
            return;
        }

        int max = arr[0];
        int maxIndex = 0;

        for(int i = 1; i < length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
                maxIndex = i;
            }
        }

        System.out.println(max);
        System.out.println(maxIndex);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        MaxInArray(arr, n);
    }

}
