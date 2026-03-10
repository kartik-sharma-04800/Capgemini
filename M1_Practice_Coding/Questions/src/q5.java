import java.util.*;

public class q5 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int flag = 0;

        for(int i  = 0;i<arr1.length;i++)
        {
            if(arr1[i]!=arr2[i])
            {
                flag = 1;
                break;
            }
        }

        if(flag==1)
        {
            System.out.println("Not an anagram");
            return;
        }

        System.out.println("Anagram");

    }
}
