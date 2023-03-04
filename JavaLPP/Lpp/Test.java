package Lpp;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        //Creat Obj.
        Shape s1 = new Rectangle();
        Shape s2 = new Triagle();

        //Type Check
        String typeinput = kb.next();
        if (typeinput.equals("T")){
            Double base = kb.nextDouble();
            Double height = kb.nextDouble();
            s2 = new Triagle(base,height);
            System.out.printf("%.2f",s2.area());
        }

        else{
            double width = kb.nextDouble();
            double length = kb.nextDouble();
            s1 = new Rectangle(width,length);
            System.out.printf("%.2f",s1.area());
        }
    }
}
