package Searching;

public class BinarySearch {
    static boolean print(int arr[] , int target){
        int n=arr.length;
        int start =0;
        int end = n-1;

        while(start<end){
            int mid = (start + end)/2;

            if(target==arr[mid]){
                return true;
            }
            else if(target <arr[mid]){
                end =mid-1;
            }
            else{
                start = mid +1;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int arr[] = {23,27,29,31,33};
        // int target=31;
        print(arr, 31);
    }
}
