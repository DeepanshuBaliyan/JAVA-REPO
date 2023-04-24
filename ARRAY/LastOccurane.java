public class LastOccurane {
    static int print(int arr[] , int x){
        int lastIndex =-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                lastIndex =i;
            }
        }
        return lastIndex;
    }
    public static void main(String[] args) {
        int arr[] = {12,1,3,14,25,14,56,14};

        int x = 14;
        System.out.println(print(arr, x));
    }
}
