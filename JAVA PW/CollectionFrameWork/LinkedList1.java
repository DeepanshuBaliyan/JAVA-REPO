package CollectionFrameWork;

import java.util.*;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(100);
        ll.add(200);
        ll.add(300);

        System.out.println(ll);
        ll.addFirst("Sakshi");
        ll.addLast("Deep");
        System.out.println(ll);


        LinkedList ll2 = new LinkedList();
        ll2.add(100);
        ll2.add(200);
        ll2.add(300);

        System.out.println(ll2);

        ;
        System.out.println(ll2.get(1));
    }
}
