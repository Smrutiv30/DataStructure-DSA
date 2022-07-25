package javatopics;

public class Linearsearch {
    public static void main(String[] args) {
        // it will compare each n every element
        int a[]={10,20,30,40,50};
        int search_ele=50;
        boolean flag=false;
        for (int i=0;i<a.length;i++){
            if (search_ele==a[i]){
                System.out.println("Element found at:"+i);
                flag=true;
                break;
            }
        }
        if (flag==false){
            System.out.println("Element not found");
        }
    }

}
