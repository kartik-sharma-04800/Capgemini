import java.util.*;

public class q6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int len = sc.nextInt();

        String[] st = str.split(" ");
        int count = 0;

        for(int i = 0;i<st.length;i++)
        {
            String s = st[i];

            StringBuilder sb = new StringBuilder();

            sb.append(s);
            if(sb.reverse().toString().equals(s))
            {
                count++;
            }

        }


        System.out.println(count);

    }
}
