package lab4.task2;

public class Atelier {
    public  void dress(Clothes[] clothes){
        for(int i=0;i<10;i++){
           if(clothes[i].getClass().getSimpleName().equals("TShirt")||clothes[i].getClass().getSimpleName().equals("Pants")){
                System.out.println(clothes[i].getClass().getSimpleName()+" это мужская и женская одежда");
            } else if (clothes[i].getClass().getSimpleName().equals("Tie")) {
               System.out.println(clothes[i].getClass().getSimpleName()+" это мужская одежда");
           } else if (clothes[i].getClass().getSimpleName().equals("Skirt")) {
               System.out.println(clothes[i].getClass().getSimpleName()+" это женская одежда");
           }
        }
    }
}
