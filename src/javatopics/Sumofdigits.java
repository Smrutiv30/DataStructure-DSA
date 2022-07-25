package javatopics;

public class Sumofdigits {
    public static void main(String[] args) {
        int num=123456;
        int sum=0;
         while (num>0){
             sum=sum+num%10; // will give 4 output
             num=num/10; //4 will eliminate and nub is 12345
         }
         System.out.println("number of all digit sum is:"+sum);
    }
}
