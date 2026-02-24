public class ReverseEvenWords
{


    public static void main(String[] args) {
        String str = "I love Java Programming very much";

        String[] str1 = str.split(" ");

        StringBuilder ans = new StringBuilder();

        for(int i= 0;i<str1.length;i++)
        {
            if((i+1)%2==0)
            {
                StringBuilder word = new StringBuilder(str1[i]);
                ans.append(word.reverse());

            }
            else
            {
                ans.append(str1[i]);
            }

            if(i!=str1.length-1)
            {
                ans.append(" ");
            }

        }

        System.out.print(ans.toString());

    }


}
