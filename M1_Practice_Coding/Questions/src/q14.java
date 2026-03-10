import java.util.*;

public class q14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int flag = 0;

        int ans =0;

        while(n>0)
        {
            int digit = n%10;

            if(flag==0 && digit!=0)
            {
                flag = 1;
            }

            if(flag ==1)
            {
                ans = ans*10 + digit;
            }

            n = n/10;
        }

        System.out.println(ans);

    }
}
