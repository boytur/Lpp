package Lpp2;


public class Logistics {
    private Truck trans ;
    private double distance ;

    public Logistics (){}

    public Logistics(Truck trans, int i) {
        this.trans = trans ;
        distance = i ;
    }

    public double planDelivery (Truck trans ,int distance){
        this.trans = trans ;
        return trans.getRate() * distance;
    }

    public double getDistance() {
        return distance;
    }

    public void delivery (){
        System.out.printf("%.2f",trans.getRate()*getDistance());
        trans.delivery();

    }
}

