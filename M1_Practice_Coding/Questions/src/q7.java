import java.util.*;

public class q7 {

    public static void main(String[] args) {


        HashSet<Character>st = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(char o : str.toCharArray())
        {
            st.add(o);
        }

        StringBuilder sb = new StringBuilder();

        for(char o : str.toCharArray())
        {
            if(st.contains(o))
            {
                sb.append(o);
                st.remove(o);
            }
        }


        System.out.println(sb.toString());





    }
}
