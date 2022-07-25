package javatopics;

import java.util.HashSet;

public class DuplicateinArrays {
    public static void main(String[] args) {
        String arr[]={"java","Html","Css","java"};

       /*boolean flag=false;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println("Found duplicate:"+arr[i]);
                    flag=true;
                }
            }
        }
    if (flag==false){
        System.out.println("Duplicate not found");

    }*/
        // by using hashset to find duplicate
        HashSet<String> lang = new HashSet<>();
       /* lang.add("java");
        lang.add("python");
        lang.add("python");
        System.out.println(lang);*/
        //enhanced for loop
        boolean flag=false;
        for (String la:arr){
           //System.out.println(lang.add(la));
            if (lang.add(la)==false){
                System.out.println("Found duplicate element:"+la);
                flag=true;
            }
        }
        if (flag==false){
            System.out.println("Duplicate not found");
        }
    }
}
