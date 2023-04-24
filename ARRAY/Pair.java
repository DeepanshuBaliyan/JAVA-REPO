public class Pair {
    static int print(int arr[] , int x){
        int ans =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j] ==x){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,6,8,10,7};

        int x=10;

        System.out.println(print(arr, x));
    }
}
