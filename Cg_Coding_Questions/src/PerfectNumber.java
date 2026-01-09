import java.util.Scanner;

public class PerfectNumber {

    public static boolean isPerfect(int number)
    {
        int sum = 0;

        for(int i = 1;i<=number/2;i++)
        {
            if(number%i==0)
            {
                sum += i;
            }
        }

        if(sum==number && number!=0)
        {
            return true;
        }
        return false;


    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();


        if(isPerfect(number))
        {
            System.out.println("Is a Perfect Number");
        }
        else
        {
            System.out.println("Is Not a Perfect Number");
        }



    }
}
