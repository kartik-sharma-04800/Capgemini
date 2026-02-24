public class MaxDiff {

    public static void main(String[] args) {

        int[] arr = {2,7,3,1,9};

        int min = arr[0];
        int maxDiff = 0;

        for(int i = 1; i < arr.length; i++) {

            int diff = arr[i] - min;
            maxDiff = Math.max(maxDiff, diff);

            min = Math.min(min, arr[i]);
        }

        System.out.println(maxDiff);
    }
}