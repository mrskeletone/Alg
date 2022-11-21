package lab6.task3;

public class Table implements Nameable {
    private String name="";

    public Table(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
       return name;
    }
}
