import java.util.*;

public class Q10 {

    public static int NumberOfCarries(int num1, int num2) {
        int carry = 0;
        int carryCount = 0;
        
        while(num1 > 0 || num2 > 0)
        {
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;
            
            int sum = digit1 + digit2 + carry;
            
            if(sum >= 10)
            {
                carry = 1;
                carryCount++;
            }
            else
            {
                carry = 0;
            }
            
            num1 = num1 / 10;
            num2 = num2 / 10;
        }
        
        return carryCount;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(NumberOfCarries(num1, num2));
    }

}
