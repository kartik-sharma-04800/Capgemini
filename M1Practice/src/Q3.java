import java.util.*;

public class Q3 {


    public static int isValid(String str)
    {


        boolean isNum = false;
        boolean isCapital = false;



        for(int i =0;i<str.length();i++)
        {

            if(str.charAt(i)==' ' || str.charAt(i)=='/')
            {
                return 0;
            }
            if(i==0 && Character.isDigit(str.charAt(i)))
            {
                return 0;
            }
            if(Character.isDigit(str.charAt(i)))
            {
                isNum = true;
            }
            if(Character.isUpperCase(str.charAt(i)))
            {
                isCapital = true;
            }


        }

        if(str.length()>=4 && isNum && isCapital)
        {
            return 1;
        }

        return 0;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(isValid(str));





    }

}
