public class CheckSorted {
    static boolean IsSorted(int arr[]){
        boolean check = true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                check = false;
                break;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};

        System.out.println(IsSorted(arr));
    }
}
