package Lpp;

public class Triagle extends Shape {
    
    double base ;
    double height ; 

    Triagle (){}

    Triagle (double base , double height){
        this.base = base ;
        this.height = height ;
    }
    @Override
    public double area() {
        return (base * height)*(0.5) ;
    }
    
}
