import java.util.*;

public class RotationPoint {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i<n;i++)
        {
            arr[i] =  sc.nextInt();
        }

        int left = -1;
        int right = arr.length;

        while(right-left>1)
        {

            int mid = left+ (right-left)/2;

            if(arr[mid]>arr[n-1])
            {
                left = mid;
            }
            else
            {
                right = mid;
            }
        }

        System.out.println(right);

//        System.out.println(arr[right]);

    }

}
