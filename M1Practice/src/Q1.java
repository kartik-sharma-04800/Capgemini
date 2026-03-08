import  java.util.*;

public class Q1 {


    public static int solve(int r,int unit,int n,int[] arr)
    {
        if(arr==null)
        {
            return -1;
        }

        int rFood = r*unit;

        int sum =0;

        for(int i =0;i<n;i++)
        {
            sum += arr[i];

            if(sum>=rFood)
            {
                return i+1;
            }
        }
        return 0;
    }

    public static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        int r = sc.nextInt();
        int unit = sc.nextInt();

        int n = sc.nextInt();

        int[] arr =  new int[n];

        for(int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(solve(r,unit,n,arr));
    }


}
