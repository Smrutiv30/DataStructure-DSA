package javatopics;

public class Arrayequality {
    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 45};
        int a2[] = {1, 2, 4, 45};

        // now check the condition
        boolean status = true;
        if (a1.length == a2.length) {
            for (int i = 0; i < a1.length; i++) {
                if (a1[i] != a2[i]) {
                    status = false;
                }
            }
        } else {
            status = false;
        }
        if (status == true) {
            System.out.println("Arrays are equals");
        } else {
            System.out.println("Arrays are not equal");
        }


    }
}
