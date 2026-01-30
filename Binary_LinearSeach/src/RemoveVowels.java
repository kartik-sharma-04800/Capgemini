import java.util.*;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ("aeiouAEIOU".indexOf(c) < 0) sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
