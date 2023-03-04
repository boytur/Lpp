package Lpp3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dis = input.nextInt();
        Truck t1 = new Truck();
        Logistic lo = new Logistic(t1,dis);
        lo.deliver();
    }
}
