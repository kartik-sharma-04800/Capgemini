import java.util.*;

public class Q11 {

    public static String ReplaceCharacter(String str, int n, char ch1, char ch2) {
        if(str == null)
        {
            return null;
        }

        if(ch1 == ch2)
        {
            return str;
        }

        boolean hasCh1 = false;
        boolean hasCh2 = false;
        
        for(int i = 0; i < n; i++)
        {
            if(str.charAt(i) == ch1) hasCh1 = true;
            if(str.charAt(i) == ch2) hasCh2 = true;
        }

        if(!hasCh1 && !hasCh2)
        {
            return str;
        }

        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < n; i++)
        {
            char c = str.charAt(i);
            if(c == ch1)
            {
                result.append(ch2);
            }
            else if(c == ch2)
            {
                result.append(ch1);
            }
            else
            {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        int n = str.length();
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);

        System.out.println(ReplaceCharacter(str, n, ch1, ch2));
    }

}
