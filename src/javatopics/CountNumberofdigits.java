package javatopics;

public class CountNumberofdigits {
    public static void main(String[] args) {
        /*int num=123456;
        int count=0;

        while (num>0){
            num=num/10;
            count++;
        }
        System.out.println(count);*/
        //count even and odd number in given
        int num=123467;
        int even_count=0;
        int odd_count=0;

        while (num>0){
            int rem=num%10;
            //now check reminder value even or odd
            if(rem%2==0){
                even_count++;
            }
            else {
                odd_count++;
            }
            num=num/10;
        }

        System.out.println("Numbers of even number:" + even_count);
        System.out.println("Numbers of odd number:"+odd_count);


    }
}
