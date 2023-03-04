package Lpp2;

public class Truck {
    private double rate = 5 ;

    public Truck(){}

    public Truck (double rate){
        this.rate = rate ;
    }

    public void delivery (){
        System.out.println("Deliver By Truck");
    }

    public double getRate() {
        return rate;
    }

}
