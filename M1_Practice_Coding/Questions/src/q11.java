import java.util.*;

public class q11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();

        if(input1.contains(input2))
        {
            System.out.println("Yes");
            return;
        }

        System.out.println("No");


    }
}
