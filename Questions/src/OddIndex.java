import java.util.*;

class OddIndex {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};

        int lastEven = arr[arr.length - 2];
        for (int i = arr.length - 2; i >= 2; i -= 2) {
            arr[i] = arr[i - 2];
        }

        arr[0] = lastEven;

        System.out.println(Arrays.toString(arr));
    }
}