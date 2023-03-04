package Lpp4;

public class Truck implements ITransport {

    double rate = 5 ;

    public Truck (){}

    public Truck (Double rate){
        this.rate = rate ;
    }

    @Override
    public void deliver() {
       System.out.println("Deliver By Truck");
    }

    @Override
    public double getRate() {
        return rate ;
    }
}
