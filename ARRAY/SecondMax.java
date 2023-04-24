public class SecondMax {
    public static  int  printmax(int arr[]){
        int max =arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
           
        }
        return max;
    }
     public  static int  SecondLargest(int arr[]){
        int large =printmax(arr);
        int SecondLargest =arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=large && arr[i]>SecondLargest){
                SecondLargest=arr[i];
            }
        }
        return SecondLargest;
      }
    
    public static void main(String[] args) {
        int arr[] = {1,23,45,32,12};

        System.out.println(SecondLargest(arr));

    }
}
