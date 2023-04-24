package String;

public class RemovingExtraSpace {
    public static void main(String[] args) {
        String str = "D e e p";
        char []ch = str.toCharArray();
        String str1 = "";
        for(int i=0 ; i<ch.length;i++){
            if(ch[i]!=' '){
                str1 = str1 +ch[i];
            }
        }
        System.out.println(str1);
    }
}
