public class MergeString {

    public static void main(String[] args) {

        String a = "abcd";
        String b = "XYZ";


        int i = 0;
        int j = 0;
        int flag = 0;

        StringBuilder ans = new StringBuilder();
        while(i<a.length() && j<b.length())
        {

            if(flag==0)
            {
                ans.append(a.charAt(i));
                flag = 1;
                i++;
            }
            else
            {
                ans.append(b.charAt(j));
                flag = 0;
                j++;
            }
        }

        while(i<a.length())
        {
            ans.append(a.charAt(i));
            i++;
        }

        while(j<b.length())
        {
            ans.append(b.charAt(j));
            j++;
        }


        System.out.println(ans.toString());

    }

}
