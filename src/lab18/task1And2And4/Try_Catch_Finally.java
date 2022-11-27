package lab18.task1And2And4;
// 1,2,4 задача
import java.util.Scanner;
public class Try_Catch_Finally {
    public static void main(String[] args) {
        try {


            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }catch (NumberFormatException e  ){
            System.out.println("You write no integer");
        }catch (ArithmeticException e){
            System.out.println("Attempted division by zero");
        }finally {
            System.out.println("work finally");
        }

    }

}

