package CollectionFrameWork;
import java.util.*;

import javax.swing.plaf.synth.SynthToggleButtonUI;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList al1 =new ArrayList();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        System.out.println(al1);

    //     System.out.println("*************************");

    //     ArrayList al2  = new ArrayList();
    //     al2.add("Deep");
    //     al2.add(1);
    //     al2.add("Sakshi");
    //     al2.add(1.1);
    //     System.out.println(al2);

    //     System.out.println("*************************************");

    //     ArrayList al3 = new ArrayList();
    //     al3.add(1);
    //     al3.add(2);
    //     al3.add(4);

    //     System.out.println(al3);

    //     al3.addAll(al2);
    //     System.out.println(al3);

    //     System.out.println("***********************************");


    //     al3.add(2, "Piddu ");
    //     System.out.println(al3);
    // }

    System.out.println(al1.contains(200));

    int index = al1.indexOf(300);
    System.out.println(index);

    System.out.println(al1.size());
}


}
