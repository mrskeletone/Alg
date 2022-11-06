package lab6.Task1;

public class MovableCircle extends MovablePoint implements Movable {
private int radius;
private  MovablePoint center;

    public MovableCircle(int x, int y, int speedX, int speedY, int radius) {
        super(x, y, speedX, speedY);
        this.radius = radius;
    }


    public void moveUp() {

    }


    public void moveDown() {

    }


    public void moveRight() {

    }


    public void moveLeft() {

    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
