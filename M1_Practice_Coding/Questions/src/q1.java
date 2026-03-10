import java.util.*;

public class q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<N;i++)
        {
            sb.append(S);
        }

        System.out.println(sb.toString());

    }



}
