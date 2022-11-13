package _2.lab2.task3;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Circle p[]=new Circle[3];
        for(int i=0;i<3;i++) {
            double x = in.nextDouble();
            double y = in.nextDouble();
            double r = in.nextDouble();
            Point a = new Point(x,y);
            p[i] = new Circle(a,r);
        }



        for (int i = 0; i<3;i++){
           System.out.println(p[i]);
        }

    }
}
