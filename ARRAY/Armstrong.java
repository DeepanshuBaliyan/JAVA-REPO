public class Armstrong {
    public static void main(String[] args) {
        int num = 371;
        int temp;
        int res=0;
        temp=num;
       
        while(temp!=0){
            int ld = temp%10;
            res = res +ld*ld*ld;
            temp = temp/10;
        }

        if(res==num){
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is not Armstrong");
        }

    }
}
