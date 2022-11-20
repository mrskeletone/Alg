package lab4_1.task2;

public class main {
    public static void main(String[] args) {
        Phone P1=new Phone(81243,"samsung",0.5);
        Phone P2=new Phone(8963570,"iphone",0.7);
        Phone P3=new Phone(342143,"Xiaomi",0.6);
        P1.receiveCall("Artem");
        P2.receiveCall("neArtem");
        P3.receiveCall("neneArtem");
        P1.receiveCall("Dima",79641225);
        System.out.println(P1+"\n"+P2+"\n"+P3);
    }
}
