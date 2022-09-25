package _2.lab2;

import _2.lab2.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle x=new Circle();
        Circle y=new Circle();
        y.setR(6);
        x.setR(5);
        System.out.println(x.getsqr());
        System.out.println(x.getlenght());
        System.out.println(x.compare(y));
    }
}
