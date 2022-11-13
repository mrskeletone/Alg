package lab6.Task1;

public class MovablePoint implements Movable {
    private int x,y,speedX,speedY;

    public MovablePoint(int x, int y, int speedX, int speedY) {
        this.x = x;
        this.y = y;
        this.speedX = speedX;
        this.speedY = speedY;
    }
    public void moveUp(){}
    public void moveDown(){}
    public void moveRight(){}
    public  void moveLeft(){}
    @Override
    public String toString() {
        return "movablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", speedX=" + speedX +
                ", speedY=" + speedY +
                '}';
    }
}
