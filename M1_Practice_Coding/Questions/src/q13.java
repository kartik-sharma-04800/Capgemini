import java.util.*;

public class q13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int cntU = 0;
        int cntL = 0;

        for(char i : str.toCharArray())
        {
            if(Character.isUpperCase(i))
            {
                cntU++;
            }
            else {
                cntL++;
            }
        }

        if(cntU>cntL)
        {
            System.out.println("UpperCase");
            System.out.println(str.toUpperCase());
            return;
        }

        System.out.println("LowerCase");
        System.out.println(str.toLowerCase());






    }
}
