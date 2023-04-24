package String;
import java.util.*;

public class ConvertUtoL {
    public static void main(String[] args) {
        // String str = "PhysICS";
        // Scanner sc = new Scanner(System.in);
        // StringBuilder str = new StringBuilder(sc.nextLine());
        // System.out.println(str);

        // for(int i=0;i<str.length();i++){
        //     boolean flag = true;
           
        //     char ch= str.charAt(i);
        //     if(ch ==' ') continue; 
        //     int asci =(int)ch;
        //     if(asci>97) flag = false;
        //     if(flag==true){
        //         asci +=32;
        //         char dh = (char)asci;
        //         str.setCharAt(i,dh);
        //     }
        //     else{
        //         asci -=32;
        //         char dh = (char)asci;
        //         str.setCharAt(i,dh);
        //     }
        // }
        // System.out.println(str);
        String s = "PrePInsTa";
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
           if(Character.isUpperCase(s.charAt(i))) 
                s1=s1+Character.toLowerCase(s.charAt(i));
           else 
                s1=s1+Character.toUpperCase(s.charAt(i));
       }
       System.out.println("Toggle String is : "+s1);
    }
}
