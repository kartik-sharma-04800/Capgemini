import java.util.Scanner;

public class CapitalizeFirstLetter {

    public static String Captialize(String str)
    {
        String[] s = str.split(" ");

        StringBuilder res = new StringBuilder();

        for(String words : s)
        {
            res.append(Character.toUpperCase(words.charAt(0)));
            res.append(words.substring(1));
            res.append(" ");
        }

        return res.toString();
    }

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(Captialize(str));

    }
}
