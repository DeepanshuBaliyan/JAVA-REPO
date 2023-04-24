package OOPSRevision;


class Student{
    int age;
    String name;
    void college(){
        name = "Deepanshu";
        System.out.println("You are in a college");
        System.out.println(name);

    }

}
class course extends Student{

}
public class Inheritance {
    public static void main(String[] args) {
        course c = new course();
        c.college();
    }
}
