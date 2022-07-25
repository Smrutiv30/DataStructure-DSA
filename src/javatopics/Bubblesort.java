package javatopics;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        // first declare the array
        // than bubble means sorting if not in sorting we need to swap number in array
        int a[]={4,2,1,5,3};
        System.out.println("Array before sorting:"+ Arrays.toString(a));
        int n=a.length;
        for (int i=0;i<n-1;i++) // number of passes
        {
            for (int j=0; j<n-1;j++) // iteration in each pass
            {
                // swapping first 2 number
                if (a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Array After  sorting:"+ Arrays.toString(a));
    }
}
