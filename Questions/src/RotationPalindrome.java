public class RotationPalindrome {

    public static boolean isPalindrome(int i,int j,String s)
    {

        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }

        return true;


    }

    public static void main(String[] args) {

        String a = "aab";

        int i = a.length()-1;

        a+=a;
        int j = 0;

        for(;i<a.length();i++)
        {
            if(isPalindrome(j,i,a))
            {
                System.out.println("Yes");
                return;
            }

        }

        System.out.println("False");


    }

}
