package lab1.task3;
public class Array {
    public static void main (String[] args) {
        int[] b={2,5,6,9,4,5,3,4,0,5};
        int sum=0;
        double sred=0;
        for (int i=0;i<b.length;i++){
            sum=sum+b[i];
        }
        sred=sum/b.length;
        System.out.println("Сумма элементов массива равна " + sum);
        System.out.println("Среднее арифметическое массива равно " + sred);
    }
}