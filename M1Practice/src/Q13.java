import java.util.*;

public class Q13 {

    public static int countExponentOf2(int num) {
        int count = 0;
        while(num % 2 == 0 && num > 0)
        {
            count++;
            num = num / 2;
        }
        return count;
    }

    public static int MaxExponents(int a, int b) {
        int maxNum = a;
        int maxExp = countExponentOf2(a);

        for(int i = a + 1; i <= b; i++)
        {
            int currentExp = countExponentOf2(i);
            if(currentExp > maxExp)
            {
                maxExp = currentExp;
                maxNum = i;
            }
            else if(currentExp == maxExp && i < maxNum)
            {
                maxNum = i;
            }
        }

        return maxNum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(MaxExponents(a, b));
    }

}
