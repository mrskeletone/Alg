package lab1.task7;
import java.util.Scanner;

import static num7.Math.factorial;

public class MathTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length;
        length = sc.nextInt();
        factorial(length);
    }
}
