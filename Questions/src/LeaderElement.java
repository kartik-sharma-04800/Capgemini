import java.util.*;

public class LeaderElement {

    public static void main(String[] args) {

        int[] arr = {16,17,4,3,5,2};

        List<Integer> leaders = new ArrayList<>();

        int maxFromRight = arr[arr.length - 1];
        leaders.add(maxFromRight);

        for(int i = arr.length - 2; i >= 0; i--) {

            if(arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                leaders.add(arr[i]);
            }
        }


        Collections.reverse(leaders);

        for(int num : leaders) {
            System.out.print(num + " ");
        }
    }
}