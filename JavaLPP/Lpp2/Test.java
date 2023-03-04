package Lpp2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int dis = kb.nextInt();
        Truck t1 = new Truck();

        Logistics l1  = new Logistics(t1,dis);
        l1.delivery();
    }
}
