import java.util.*;
public class ReverseMirrorCharacter {

    public static void main(String[] args) {

        String a = "aba";
        int i = 0;
        int j = a.length()-1;

        while(i<a.length() && j>=0)
        {
            if(a.charAt(i)!=a.charAt(j))
            {
                System.out.println("Not a mirror");
                return;
            }
            i++;
            j--;
        }

        StringBuilder ans = new StringBuilder();

        if(a.length()%2==0)
        {
            for(int r  =  0;r<(a.length()/2);r++)
            {
                ans.append(a.charAt(r));
            }
        }
        else
        {
            for(int r  =  0;r<=(a.length()/2);r++)
            {
                ans.append(a.charAt(r));
            }
        }


        System.out.print(ans.toString());






    }

}
