import java.util.*;

public class Q9 {

    public static String MoveHyphen(String str, int n) {
        if(str == null)
        {
            return null;
        }

        StringBuilder hyphens = new StringBuilder();
        StringBuilder others = new StringBuilder();

        for(int i = 0; i < n; i++)
        {
            char c = str.charAt(i);
            if(c == '-')
            {
                hyphens.append(c);
            }
            else
            {
                others.append(c);
            }
        }

        return hyphens.toString() + others.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        int n = str.length();

        System.out.println(MoveHyphen(str, n));
    }

}
