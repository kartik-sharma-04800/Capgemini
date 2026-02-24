import java.util.*;

public class Swapping {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i =0 ;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        int j = 0;

        while(j<arr.length-1)
        {
            if(arr[j]>arr[j+1])
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }

            j+=2;

        }

        for(int c : arr)
        {
            System.out.print(c);
        }


    }

}
