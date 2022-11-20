package lab4_1.task9;

import java.util.Scanner;

public class FurnitureShop {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Хотите купить и установить полку(1) или шкаф(2)");
        int n=in.nextInt();
        if(n==1){
            Furniture shelf=new Shelf();
            shelf.installation();
        }else if(n==2) {
            Furniture cupboard=new Cupboard();
            cupboard.installation();
        }else{System.out.println("Вы выбрали не существующий вариант");}
    }
}
