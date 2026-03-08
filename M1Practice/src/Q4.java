import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        int num = sc.nextInt();
        int diff  = sc.nextInt();

        int cnt =0;
        for(int i : arr)
        {
            if(Math.abs(i-num)<=diff)
            {
                cnt++;
            }
        }
        System.out.println(cnt);




    }

}
