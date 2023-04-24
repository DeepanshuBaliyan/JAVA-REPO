package OOPSRevision;


class Animal{
    void eat(){
        System.out.println("Eating ...");
    }
}
class Cat extends Animal{
    void Meow(){
        System.out.println("Meowing ...");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barking....");
    }
}
public class hirerachical {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();

        Cat c = new Cat();
        c.Meow();
        c.eat();
    }
}
