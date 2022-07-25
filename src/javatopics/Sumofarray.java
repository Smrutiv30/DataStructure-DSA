package javatopics;

public class Sumofarray {
    public static void main(String[] args) {
        // take array and specify size of array
        int a[]={5,3,6,7,9};
        int sum=0;
        // using for loop iterate value
       // for (int i=0; i<=a.length-1;i++){
          //  sum=sum+a[i];
   // }
        //enhanced for loop
        for (int value:a){
            sum=sum+value;
        }
        System.out.println("Sum of array:"+sum);

    }

}
