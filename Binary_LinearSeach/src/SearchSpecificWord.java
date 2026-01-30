import java.util.*;

public class SearchSpecificWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        boolean found = false;

        String[] str = new String[n];

        for(int i  = 0;i<n;i++)
        {
            str[i] = sc.nextLine();
        }

        String word = sc.nextLine();

        for(String i : str)
        {
            if(i.contains(word)){


                System.out.println(i);
                found = true;
                return;
            }
        }
        if(found==false)
        {
            System.out.println("Not Found");
        }


    }
}
