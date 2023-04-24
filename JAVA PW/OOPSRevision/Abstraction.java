package OOPSRevision;


 abstract class AeroPlane1{
   abstract void TakeOff();
   abstract void Fly();
}

class CargoPlane2 extends AeroPlane1{
    void TakeOff(){
        System.out.println("CargoPlane requires longer runway to takeoff");
    }
    void Fly(){
        System.out.println("Fly at lower height");
    }
    void Alert(){
        System.out.println("Alert");
    }
}
class PassangerPlane2 extends AeroPlane1{
    void TakeOff(){
        System.out.println("PassangerPlane take medium runway to take off");
    }
    void Fly(){
        System.out.println("Fly at medium height");
    }
}
public class Abstraction {
    public static void main(String[] args) {
      AeroPlane1 c = new CargoPlane2();
        c.Fly();
        c.TakeOff();
       
        ((CargoPlane2)c).Alert();

        AeroPlane1 p = new PassangerPlane2();
        p.Fly();
        p.TakeOff();
    }
}
