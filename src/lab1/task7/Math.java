package lab1.task7;

public class Math {
    public static void factorial(int i) {
        int fact = 1;
        for (int f = i; f > 0; f--){
            fact *= f;
        }
        System.out.println(fact);
    }

}
