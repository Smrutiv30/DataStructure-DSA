package javatopics;

public class ReverseEachWordinString {
    public static void main(String[] args) {
        String str="Welcome to coding journey";
       /* String[] word=str.split(" "); //spliting into words
        String reversestring="";
        for (String s: word) {
            String reverseword="";
            for (int i=s.length()-1;i>=0;i--){
                reverseword=reverseword+s.charAt(i);
            }
           reversestring=reversestring+reverseword+" ";

        }
        System.out.println(reversestring);*/

        //Approach 2
 String[] word=str.split("\\s");
 String reverseword="";
        for (String w:word)
        {
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseword =reverseword+sb.toString()+" ";
        }
        System.out.println(reverseword);

    }

}
