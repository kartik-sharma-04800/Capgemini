import java.util.*;

public class SearchForFirstNegative {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i =0 ;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);



    }

}
