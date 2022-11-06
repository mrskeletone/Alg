package lab6.Task1;

public class MovablePoint implements Movable {
    private int x,y,speedX,speedY;

    public MovablePoint(int x, int y, int speedX, int speedY) {
        this.x = x;
        this.y = y;
        this.speedX = speedX;
        this.speedY = speedY;
    }
    public void moveUp(){
    System.out.println("Передвижение точки вверх");
    }
    public void moveDown(){
        System.out.println("Передвижение точки вниз");
    }
    public void moveRight(){
        System.out.println("Передвижение точки вправо ");
    }
    public  void moveLeft(){
        System.out.println("Передвижение точки влево");
    }
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
