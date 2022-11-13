package lab4.task2;

public class main {
    public static void main(String[] args) {
        Clothes[] clothes= new Clothes[10];
        for(int i=0;i<4;i++){
            clothes[i]=new TShirt((int)(Math.random()*8+32),(int)(Math.random()*100+100),'r');
        }
        for(int i=4;i<8;i++){
            clothes[i]=new Pants((int)(Math.random()*8+32),(int)(Math.random()*100+100),'b');
        }
        clothes[8]=new Skirt((int)(Math.random()*8+32),(int)(Math.random()*100+100),'g');
        clothes[9]=new Tie((int)(Math.random()*8+32),(int)(Math.random()*100+100),'b');
        Atelier a=new Atelier();
        a.dress(clothes);

    }


}
