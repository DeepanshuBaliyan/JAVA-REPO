public class Max {
    public static void main(String[] args) {
        int arr[] = {2,3,6,9,11,45};

        int max = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        System.out.println(max);
    }
}
