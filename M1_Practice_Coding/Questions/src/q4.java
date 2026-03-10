import java.util.*;

public class q4 {
    public static void main(String[] args) {

        Scanner sc=  new Scanner(System.in);


        String str= sc.nextLine();

        HashMap<Character,Integer>mp = new HashMap<>();

        for(char o : str.toCharArray())
        {
            mp.put(o,mp.getOrDefault(o,0)+1);
        }

        int maxi = Integer.MIN_VALUE;
        char ch = 'A';

        int flag = 0;

        for(var i : mp.entrySet()){

            if(maxi<i.getValue())
            {
                ch= i.getKey();
                maxi = i.getValue();
                flag = 0;
            }
            else if(maxi==i.getValue())
            {
                flag = 1;
            }
        }

        if(flag==1)
        {
            System.out.println(0);
            return;
        }

        System.out.print(ch);


    }
}
