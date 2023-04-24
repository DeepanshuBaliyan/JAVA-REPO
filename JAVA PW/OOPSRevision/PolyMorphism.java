package OOPSRevision;

class AeroPlane3 {
    void TakeOff(){
        System.out.println("AeroPlane is ready to takeoff .. ");
    }
    void Fly(){
        System.out.println("Aeroplane is ready to fly ");
    }
}

class CargoPlane extends AeroPlane3{
    void TakeOff(){
        System.out.println("Need longer runway to takeoff ..");
    }
    void Fly (){
        System.out.println("Fly at loewr level ..");
    }
}

class PassangerPlane extends AeroPlane3{
    void TakeOff(){
        System.out.println("Need medium runway to takeoff..");
    }
    void Fly(){
        System.out.println("Fly at medium height.");
    }
}
class FighterJet extends AeroPlane3{
    void TakeOff(){
        System.out.println("Need short runway to takeoff..");
    }
    void Fly(){
        System.out.println("Fly at high height.");
    }
}

class Airport{
    public void poly(AeroPlane3 ref){
        ref.TakeOff();
        ref.Fly();
        System.out.println("------------------------------");
    }
}
public class PolyMorphism {
    public static void main(String[] args) {
        CargoPlane c = new CargoPlane();
        PassangerPlane pp = new PassangerPlane();
        FighterJet f = new FighterJet();

      Airport a = new Airport();
        a.poly(c);
        a.poly(f);
        a.poly(pp);
    }
}
