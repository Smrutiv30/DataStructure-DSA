package javatopics;

import java.util.Scanner;

public class StringReverse {
   public static void main(String[] args){

       Scanner sc= new Scanner(System.in);
        System.out.println("Enter your string:");
        String org=sc.next();

        String rev="";
        int len=org.length();
        // iterate the for loop for string
        for(int i=len-1;i>=0;i--) {
            rev = rev + org.charAt(i);
        }
            System.out.println("After reverse string is:" +rev);
if(org.equals(rev)){
    System.out.println("String is palindrome");

}
else{
    System.out.println("String is not palindrome");
}
                }


            }





