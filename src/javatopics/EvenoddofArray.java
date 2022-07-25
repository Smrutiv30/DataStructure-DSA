package javatopics;

public class EvenoddofArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        //extracting even number
        for (int i=0;i<a.length;i++){
            // check divide by 2 or not
            if (a[i]%2==0)
                System.out.println(a[i]);
        }
        //odd number
        for (int i=0;i<a.length;i++)


        {
            if (a[i]%2 !=0)
                System.out.println(a[i]);
        }

    }
}

