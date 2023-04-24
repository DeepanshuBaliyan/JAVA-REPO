public class SearchElement {
 public static void main(String[] args) {
        SearchElement obj = new SearchElement();

        int arr [] = {1,2,3,4,5,8,6,9};

        int x=6;
        int ans =-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i] ==x){
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
