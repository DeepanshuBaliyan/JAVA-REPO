package String;

public class PallindromicString {
    public static void main(String[] args) {
        String str = "abcdcba";
        StringBuilder gtr = new StringBuilder(str);
        gtr.reverse();
        String s = gtr + "";
        if(str.equals(s)){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("NOt Pallindrome");
        }
    }
}
