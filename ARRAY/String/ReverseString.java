package String;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Deepanshu";
        StringBuilder sb = new StringBuilder("");
        sb.append(str);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
