import java.util.*;

public class LongestUniqueSubstring {

    public static void main(String[] args) {

        int maxi = 0;
        String str = "pwwkew";

        HashSet<Character> set = new HashSet<>();

        int i = 0;

        for (int j = 0; j < str.length(); j++) {

            while (set.contains(str.charAt(j))) {
                set.remove(str.charAt(i));
                i++;
            }

            set.add(str.charAt(j));
            maxi = Math.max(maxi, j - i + 1);
        }

        System.out.println(maxi);
    }
}