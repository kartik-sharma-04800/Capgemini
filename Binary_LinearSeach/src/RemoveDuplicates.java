import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        HashSet<Character> st = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!st.contains(c)) {
                st.add(c);
                sb.append(c);
            }
        }
        System.out.println(sb.toString());


    }

}
