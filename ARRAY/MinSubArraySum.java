public class MinSubArraySum {
    static void SumArrays(int arr[]){
        int current = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            
            int start =i;
            for(int j=i;j<arr.length;j++){
                int end =j;
                current =0;
                for(int k=start ;k<=end ;k++){
                    current = current +arr[k];
                }
                System.out.println(current);
                if(min>current){
                    min = current;
                }
            }
        }
        System.out.println("max sum ="+min);
    }
    public static void main(String[] args) {
        int arr[] ={1,-2,6,-1,3};
        SumArrays(arr);
        
    }
}
