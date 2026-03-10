import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i = 0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }

        if(nums.length==1){
            System.out.println(0);
            return;
        }

        int l = -1;
        int r = nums.length;

        while(r-l>1)
        {
            int m = l + (r-l)/2;

            if(m==0 || nums[m-1]<nums[m])
            {
                l = m;
            }
            else
            {
                r = m;
            }
        }
        System.out.println(nums[l]);
    }

}
