public class MaxSubArraySum {
    static void SumArrays(int arr[]){
        int current = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            
            int start =i;
            for(int j=i;j<arr.length;j++){
                int end =j;
                current =0;
                for(int k=start ;k<=end ;k++){
                    current = current +arr[k];
                }
                System.out.println(current);
                if(max<current){
                    max = current;
                }
            }
        }
        System.out.println("max sum ="+max);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};

        SumArrays(arr);
    }
}
