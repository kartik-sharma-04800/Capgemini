import java.util.*;
public class FirstRepeatedString {

    public static void main(String[] args) {

        String[] arr = {"Java","Python","C++","Java","C++"};

        List<String>l = new ArrayList<>();


        for(String i : arr)

        {
            l.add(i);
        }

        for(String j : arr){
            if(l.contains(j))
            {
                System.out.println(j);
                return;
            }
        }





    }
}
