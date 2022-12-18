package lab1.task7;
import java.util.Scanner;


public class MathTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length;
        length = sc.nextInt();
        factorial(length);
    }
    public static void factorial(int i) {
        int fact = 1;
        for (int f = i; f > 0; f--){
            fact *= f;
        }
        System.out.println(fact);
    }
}
