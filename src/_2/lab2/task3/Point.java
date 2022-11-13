package _2.lab2.task3;

class Point {
    protected double x;
    protected double y;

    Point() {
    }

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        return "Центр точки:" + x + " " + y;
    }
}
