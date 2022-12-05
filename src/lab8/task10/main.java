package lab8.task10;

public class main {
    public static double recursion(double n) {
        double q=n/10;
        int w;
        q=q%1;
        q=q*10;
        w=(int)q;
        if(w!=0){
        System.out.print(w);}
        if(n<=1)
        {
            return 1;
        }
        q=0;
        return recursion(n /10);
    }

    public static void main(String[] args) {
        System.out.println(recursion(1234));

    }
}
