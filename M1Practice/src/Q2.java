import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        if(str.length()==0)
        {
            System.out.println("-1");
            return;
        }

        int ops = str.charAt(0)-'0';

        for(int i =1;i<str.length();i+=2)
        {
                int temp = str.charAt(i+1)-'0';
                if(str.charAt(i)=='A')
                {
                    ops = ops & temp;
                }
                if(str.charAt(i)=='B')
                {
                    ops = ops | temp;
                }
                if(str.charAt(i)=='C')
                {
                    ops = ops ^ temp;
                }
        }
        System.out.println(ops);

    }

}
