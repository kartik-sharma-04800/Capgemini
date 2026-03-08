import java.util.*;

public class Q20 {

    public static int FindAutoCount(String n) {
        if(n == null || n.length() == 0)
        {
            return 0;
        }

        int[] count = new int[10];
        
        for(int i = 0; i < n.length(); i++)
        {
            char c = n.charAt(i);
            if(Character.isDigit(c))
            {
                count[c - '0']++;
            }
        }

        boolean[] present = new boolean[10];

        for(int i = 0; i < n.length(); i++)
        {
            int expected = n.charAt(i) - '0';
            int actual = count[i];

            if(expected != actual)
            {
                return 0;
            }

            present[i] = true;
        }

        int uniqueCount = 0;
        for(int i = 0; i < n.length(); i++)
        {
            if(present[i])
            {
                uniqueCount++;
            }
        }

        return uniqueCount;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String n = sc.nextLine();

        System.out.println(FindAutoCount(n));
    }

}
