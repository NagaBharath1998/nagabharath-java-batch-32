package day0405;

public class Main {
    public static void main(String[] arg) {
        Laptop laptop = new Laptop();
        laptop.connected();
        laptop.poweron();

        Car car1 = new Car("Toyota", "Corolla");
        System.out.println("day0405.Car 1 - Manufacturer: " + car1.manufacturer);
        System.out.println("day0405.Car 1 - Model: " + car1.getModel());

        Car car2 = new Car("Mustang");
        System.out.println("day0405.Car 2 - Manufacturer: " + car2.manufacturer);
        System.out.println("day0405.Car 2 - Model: " + car2.getModel());

        System.out.println("Static variable: " + Question3.getStaticVariable());

        FinalClass finalObj = new FinalClass();
        System.out.println("Final Variable: " + finalObj.finalVariable);
        finalObj.finalMethod();
    }
}
