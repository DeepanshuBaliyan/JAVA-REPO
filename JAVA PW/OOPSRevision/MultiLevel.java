package OOPSRevision;


class AeroPlane{
    public void TakeOff(){
        System.out.println("AeroPlane is ready to takeOff");
    }
    public void Fly(){
        System.out.println("AeroPlane is ready to fly");
    }
}

class CargoPlane extends AeroPlane{
    public void Fly(){
        System.out.println("CargoPlane fly at Lowest Altitude");
    }
}
class PassangerPlane extends AeroPlane{
    public void Fly(){
        System.out.println("PassangerPlane fly at Higest Altitude");
    }
}
public class MultiLevel {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        cp.Fly();
        cp.TakeOff();


        PassangerPlane pp = new PassangerPlane();
        pp.TakeOff();
        pp.Fly();
    }
}
