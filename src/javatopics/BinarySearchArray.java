package javatopics;



public class BinarySearchArray {
    //best case:O(1)
    //worst case:O(logk N)
    public static void main(String[] args) {
        //it should be in sorted order if not sort
        // first find mid-value than check mid-value is greater than mid-value or greater than mid -value
        //case 1 key==mid
        //case 2 key>mid l=mid+1
        //case 3 key<mid h=mid-1
        int arr[] = {1, 2, 3, 4, 5, 6};
        // if array is not sorted than first sort the element
        //Arrays.sort(arr);
        // findout the length of array
        int n = arr.length;
        // which number or index you want to find out
        int x = 3;
        // assign all the value
        int result = binarysearch(arr, x, 0, n - 1);
        //put the condition to check
        if (result == -1) {
            System.out.println("Element is not found");
        } else {
            System.out.println("Element is  found at index:" + result);

        }
    }
        // create method
        public static int binarysearch(int arr[],int x, int low, int high){
        while (low<=high){
            int mid=low+(high-low)/2;
            if (arr[mid]== x)
                return mid;
            if (arr[mid]<x)
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;


    }
}
