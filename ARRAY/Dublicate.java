public class Dublicate {
    public static void main(String[] args) {
        int arr[] ={1,3,4,5,7,4,3,8,9,0};

        int temp [] = new int [arr.length];
        int count =0;

        for(int i=0;i<temp.length;i++){
            if(temp[arr[i]]==1){
                System.out.println(arr[i]);
            }else{
               
                temp[arr[i]]++;
            }
        }
    }
}
