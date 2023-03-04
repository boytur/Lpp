package Lpp4;
public class Logistic {
    ITransport transport ;
    int distance ;

    public Logistic(Truck transport, int distance) {
        this.transport = transport ;
        this.distance = distance ;
    }

    public double planDelivery (ITransport transport , int distance){
        return distance*transport.getRate();
    }

    public void deliver(){
        System.out.printf("%.2f",planDelivery(transport, distance));
        System.out.println("\nDeliver By Truck");
    }

}
