package javatopics;

public class Maxandminelementarray {
    public static void main(String[] args) {
        int a[]={20,30,40,60};
        int max=a[0];
        for (int i=1;i<a.length;i++){
            if (a[i]>max){
                max=a[i];
            }
        }
        System.out.println("maximum number is:"+max);

    }
}
