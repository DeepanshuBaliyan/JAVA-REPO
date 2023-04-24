public class MovesZeroAtEnd {
    static void print(int arr[]){
        int temp [] = new int [arr.length];
        int k =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp[k++]=arr[i];
            }
        }
        while(k<arr.length){
            temp[k]=0;
            k++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(temp[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,0,2,3,2,0,0,4,5,1};
        print(arr);
    }
}
