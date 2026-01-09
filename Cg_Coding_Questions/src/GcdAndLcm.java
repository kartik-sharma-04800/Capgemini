import java.util.Scanner;

public class GcdAndLcm {
    public static int gcd(int a,int b)
    {
        if(a==0)
        {
            return b;
        }

        return gcd(b%a,a);

    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a  = sc.nextInt();
        int b  = sc.nextInt();

        int gcdOfNumbers = gcd(a,b);
        int lcmOfNumbers = (a*b)/gcdOfNumbers;

        System.out.println(gcdOfNumbers);
        System.out.println(lcmOfNumbers);





    }

}
