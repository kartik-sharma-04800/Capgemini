import java.util.*;
public class q16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];


        for(int i = 0 ;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        int cnt=0;
        for(int num:arr) {
            if (num >= 0) {
                cnt++;
            }
        }

        int mid = (cnt-1)/2;
        int j=0;
        for(int num:arr)
            if(num>=0){
                if(j==mid){
                    System.out.print(num);
                    break;
                }
                j++;
            }
    }
}