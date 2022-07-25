package javatopics;

public class Primenumber {
    public static void main(String[] args) {

        // declare variable
        //prime number is divisable only  by 1 and itself : ex-2,3,5,7,11,13
       int  count=0;
       int num=5;

       // check condition
        if(num>1){
            for(int i=1;i<=num;i++){
                if(num%i==0)
                    count++;

            }
            if(count==2){
                System.out.println("Number is prime number");

            }
            else{
                System.out.println("Number is not prime number");
            }


        }
        else{
            System.out.println("Number is not prime number");
        }

    }
}
