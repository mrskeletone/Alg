package _2.lab2.task6;

class Circle {
    final double pi = 3.14;
    private double l;
    private double r;

    Circle() {
    }

    Circle( double y, double r) {

        this.l = y;
        this.r=r;
    }


    public double getl() {
        return l;
    }

    public double getR() {
        return r;
    }



    public void setl(double y) {
        this.l = y;
    }

    public void setR(double r) {
        this.r = r;
    }
    public void Compare(Circle circle){
        if(this.area()>circle.area()){
            System.out.println("1 окружность больше");
        }else {System.out.println("2 окружность больше");}
    }
    public double area() {
        return pi * r * r;
    }

    public double lenCirc() {
        return 2 * pi * r;
    }


    public String toString() {
        return "Длина:" + this.lenCirc() +
                "Площадь:" + this.area();
    }
}
