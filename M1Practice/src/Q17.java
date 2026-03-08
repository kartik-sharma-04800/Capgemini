import java.util.*;

public class Q17 {

    public static boolean isPalindrome(int num) {
        String str = Integer.toString(num);
        int left = 0;
        int right = str.length() - 1;
        
        while(left < right)
        {
            if(str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int lower = sc.nextInt();
        int upper = sc.nextInt();
        
        boolean first = true;
        
        for(int i = lower; i <= upper; i++)
        {
            if(isPalindrome(i))
            {
                if(!first)
                {
                    System.out.print(", ");
                }
                System.out.print(i);
                first = false;
            }
        }
        
        System.out.println(".");
    }

}
