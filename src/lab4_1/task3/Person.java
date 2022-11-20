package lab4_1.task3;

public class Person {
    private String fullName;
    private int age;
    public void talk(){
        System.out.println("Такой-то "+this.fullName+" говорит");
    }
    public void move(){
        System.out.println("Такой-то "+this.fullName+" двигается");
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
    }
}
