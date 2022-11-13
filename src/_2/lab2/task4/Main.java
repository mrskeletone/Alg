package _2.lab2.task4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Shop sh = new Shop();

        String md = in.nextLine();
        sh.add(md);
        sh.add("Acer swift");
        sh.add("Apple macbook");
        sh.add("Lenovo ideaPad");
        sh.add("HHHJHJ");
        sh.getList();
        sh.delPC("HHHJHJ");
        String mod = in.nextLine();
        System.out.println(sh.find(mod));
        sh.getList();
    }
}
