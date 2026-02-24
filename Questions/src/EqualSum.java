import  java.util.*;

public class EqualSum {

    public static void main(String[] args)
    {

        int[] arr = {0,3,3,0,6,0};
        int i =1;
        int j = arr.length-2;
        int lsum = arr[0];
        int rsum = arr[arr.length-1];

        while(i<arr.length-2 && j>0) {
            if (lsum <=rsum) {
                lsum += arr[i];
                i++;
            } else {
                rsum += arr[j];
                j--;
            }

        }

        if (lsum == rsum) {
            System.out.println("Yes");
            return;
        }
            System.out.println("No");



    }

}
