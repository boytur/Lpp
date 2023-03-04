package Lpp;

public class Rectangle extends Shape{
    double width ; 
    double length ;

    Rectangle (){}

    Rectangle (double width , double length){
        this.length  = length ; 
        this.width  = width ;
    }

    @Override
    public double area() {
        return length * width ; 
    }
}
