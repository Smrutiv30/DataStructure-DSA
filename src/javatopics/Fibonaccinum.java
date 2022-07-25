package javatopics;
//0 1 1 2 3 5 8 13 21 34

public class Fibonaccinum {
    public static void main(String[] args) {
        // declare variable 3
        int n1=0 , n2=1, sum=0;
        // print first 2 fibonacci series num
        System.out.print(n1+" "+n2);

        // condition
        for (int i=2;i<10;i++){
            sum=n1+n2;
            System.out.print(" "+sum);

            //interchange the value
            n1=n2;
            n2=sum;

        }

}
}
