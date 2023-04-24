public class Occurance {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,3,6,7,3,9,9,9,9,9};
        int x=9;
        int temp =0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                temp++;
                
            }
        }
        System.out.println(temp);
    }
}
