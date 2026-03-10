import java.util.*;

public class q3 {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        char[] alphabets = new char[26];

        char ch = 'A';

        for(int i = 0;i<26;i++)
        {
            alphabets[i] = ch;
            ch++;
        }

        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        int count = 0;


        int flag  =0;

        for(int i = 0;i<str.length();i++)
        {
            if(str.charAt(i)=='0')
            {
                sb.append(alphabets[count-1]);
                count = 0;
                flag = 1;
            }
            else {
                count++;
                flag = 0;
            }

        }


        if(flag!=1)
        {
            sb.append(alphabets[count-1]);
        }





        System.out.println(sb.toString());

    }



}
