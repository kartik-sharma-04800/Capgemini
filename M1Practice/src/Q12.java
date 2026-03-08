import java.util.*;

public class Q12 {

    public static int OperationChoices(int c, int n, int a, int b) {
        switch(c)
        {
            case 1:
                return a + b;
            case 2:
                return a - b;
            case 3:
                return a * b;
            case 4:
                return a / b;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int c = sc.nextInt();
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(OperationChoices(c, n, a, b));
    }

}
