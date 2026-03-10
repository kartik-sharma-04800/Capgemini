import java.util.*;

public class q8 {

    public static void main(String[] args) {


        HashSet<Integer>st = new HashSet<>();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            st.add(arr[i]);
        }

        int[] ans = new int[st.size()];
        int j = 0;

        for(int i = 0;i<n;i++)
        {
            if(st.contains(arr[i]))
            {
                ans[j] = arr[i];
                st.remove(arr[i]);
                j++;
            }
        }

        for(int i : ans)
        {
            System.out.print(i + " ");
        }






    }
}
