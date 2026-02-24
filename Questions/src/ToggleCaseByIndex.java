public class ToggleCaseByIndex {

    public static void main(String[] args) {


        String str = "java programming";

        StringBuilder ans = new StringBuilder();
        int j = 0;

        for(int i = 0;i<str.length();i++)
        {
            if(j%2==0)
            {
                ans.append(Character.toUpperCase(str.charAt(i)));
            }
            else
            {
                ans.append(Character.toLowerCase(str.charAt(i)));
            }
            if(str.charAt(i)!=' ')
            {
                j++;
            }
        }



        System.out.println(ans.toString());


    }

}
