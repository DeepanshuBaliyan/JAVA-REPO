package CollectionFrameWork;
import java.util.*;

public class TS {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(10);
        ts.add(200);
        ts.add(50);
        ts.add(400);
        ts.add(75);
        ts.add(30);

        System.out.println(ts);


        System.out.println(ts.ceiling(40));
    }
}
