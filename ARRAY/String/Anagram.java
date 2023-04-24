package String;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String x = "keep";
        String y = "peek";

        char a[] = x.toCharArray();
        char b[] = y.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        // Boolean result = Arrays.equals(a,b);
        if(Arrays.equals(a, b)){
            System.out.println("String is Anagram");
        }
        else{
            System.out.println("String is not anagram");
        }
    }
}
