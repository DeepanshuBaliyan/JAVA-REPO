package String;

public class RemoveVowel {
    public static void main(String[] args) {
        String str = "Deepanshu";

        String s1 = "";
        s1 = str.replaceAll("[aeiou]", "");
        System.out.println("String after :" +s1);
    }
}
