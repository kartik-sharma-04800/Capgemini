import java.util.*;

public class q12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr  = new int[n];

        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int cnt = 1;

        Arrays.sort(arr);

        for(int i =0;i<n;i++)
        {
            if(arr[i]!=cnt)
            {
                System.out.print(cnt);
                return;
            }

            cnt++;
        }


        System.out.print(cnt);




    }
}
