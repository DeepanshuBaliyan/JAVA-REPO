public class LinearSearch {
    static int print(int arr[] ,int x ){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        int x=10;

        int index =print(arr, x);
        if(index ==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Key is at index:" + index);
        }
    }
}
