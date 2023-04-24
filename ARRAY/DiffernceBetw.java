public class DiffernceBetw {
    public static int print(int arr[] , int x){
        int count =0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length; j++){
                if(arr[j] - arr[i] ==x){
                    count ++;
                }
            }
            // return count;
        }
        
        return count;

    }
    public static void main(String[] args) {
        int arr[] = {5,10,15,20,25,30,35,40};

        int x = 10;

        System.out.println(print(arr, x));
    }
}
