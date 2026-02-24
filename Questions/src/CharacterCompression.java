public class CharacterCompression {

    public static void main(String[] args) {

        String str = "aabbbcdd";

        StringBuilder ans = new StringBuilder();

        char check = str.charAt(0);
        int cnt = 0;

        for(int i = 0;i<str.length();i++)
        {
            if(check == str.charAt(i))
            {
                cnt++;
            }
            else
            {
                ans.append(check);
                ans.append(cnt);
                check = str.charAt(i);

                cnt = 1;
            }
        }

        ans.append(check);
        ans.append(cnt);

        System.out.println(ans.toString());



    }


}
