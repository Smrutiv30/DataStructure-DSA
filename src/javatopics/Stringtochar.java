package javatopics;

public class Stringtochar {
    public static void main(String[] args) {
        String str="abcd";
        String rev="";
        char a[]=str.toCharArray();
        int len=a.length;
        // iterate the for loop for string
        for(int i=len-1;i>=0;i--) {
            rev = rev +a[i];
        }
        System.out.println("After reverse string is:" +rev);
    }
}
