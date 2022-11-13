package _2.lab2.task3;

class Circle {
    private Point a;
    private double r;

    //  Point pt = new Point();

    Circle(Point a, double r) {
        this.a = a;
        this.r = r;
    }

    Circle() {
    }


    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }


    public String toString() {
        return a + "\n" +
                "Радиус равен:" + r;
    }
}
