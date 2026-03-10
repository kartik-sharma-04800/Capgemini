import java.util.*;

public class q15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str =  sc.nextLine();


        StringBuilder sb = new StringBuilder();

        if(str.length()>10)
        {
            sb.append(str.charAt(0));
            sb.append(str.length()-2);
            sb.append(str.charAt(str.length()-1));
        }

        System.out.println(sb.toString());

    }
}
