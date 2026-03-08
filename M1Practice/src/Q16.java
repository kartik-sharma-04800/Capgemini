import java.util.*;

public class Q16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        int sum = 0;
        
        for(int i = 1; i <= 10; i++)
        {
            int multiple = num * i;
            System.out.print(multiple);
            
            if(i < 10)
            {
                System.out.print(", ");
            }
            
            sum += multiple;
        }
        
        System.out.println();
        System.out.println(sum);
    }

}
