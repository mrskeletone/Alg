package lab13.task2;
abstract class Main {
    public static void main(String[] args) {
        String strings = "Страна; Регион; Город; Улица. Дом/ Корпус, Квартира";
        Address address = new Address(strings, false);
        System.out.println(address);
    }
}