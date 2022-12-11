package lab1.task6;

public class Harmonic {
    public static void main (String[] args){
        double r;
        for (int i = 1; i<=10;i++){
            String str = String.format("1/%d + ", i);
            System.out.print(str);
        }
        System.out.print(" ... ");
    }
}
