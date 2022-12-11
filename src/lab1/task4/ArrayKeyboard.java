package lab1.task4;
import java.util.Scanner;


public class ArrayKeyboard {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int length;
        System.out.println("Введите желаемое количество элементов в массиве ");
        length= sc.nextInt();
        int[] arr = new int[length];
        for(int i=0;i<length;i++){
            System.out.print("Число " + (i+1) + ": ");
            arr[i]=sc.nextInt();
        }
        int summa=0,min=arr[0],max=arr[0];
        for(int i=0;i<length;i++){
            summa=summa+arr[i];
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]);
        }
        System.out.println("Сумма элементов массива равна " + summa);
        System.out.println("Минимальный элемент массива равен " + min);
        System.out.println("Максимальный элемент массива равен " + max);
    }
}
