package lab6.Task1;
interface Drawable {
    void draw ();
}
// Реализация: вторым пользователем
class Rectangle implements Drawable {
    public void draw () {
        System.out.println("Рисование прямоугольника\n" );
    }}
class Circle implements Drawable {
    public void draw(){System.out.println("Рисование круга\n"
    );
    }}
// Использование интерфейса: третьим пользователем
class Main {
    public static void main (String args []) {
        Drawable d = new Circle ();
/* В реальном сценарии объект предоставляется методом,
например, getDrawable () */
        d.draw ();
    }}