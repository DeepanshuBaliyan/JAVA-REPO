public class Occurance2 {
    static int print(int arr[] ){
        int count =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,1,5,6,1,7,8,9};

        // int count =0;

      
        System.out.println(print(arr));
    }
}
