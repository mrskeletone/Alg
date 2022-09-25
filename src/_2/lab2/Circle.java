package _2.lab2;

public class Circle {
   double r=0;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public  double getlenght(){
        double c;
        c=Math.PI*this.r;
       return c;
   }
    public  double getsqr(){
        double c;
        c=2*Math.PI*this.r;
        return c;
    }
    public double compare(Circle x){
        if(this.getsqr()>x.getsqr()){
            return this.r;
        }else {return x.r;}
    }
}
