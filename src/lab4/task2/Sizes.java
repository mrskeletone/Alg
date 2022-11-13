package Lab4.task2;

public enum Sizes {
    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40);
    double euroSize;
    public  void  getDescription(){
        if(Sizes.this== Sizes.XXS){
            System.out.println("Детская одежда");
        }else System.out.println("Взрослая одежда");
    }
    Sizes(double euroSize) {
        this.euroSize = euroSize;
    }
}
