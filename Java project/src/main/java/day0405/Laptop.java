package day0405;

public class Laptop implements Powerable, Connectable{
    @Override
    public void connected() {
        System.out.println("day0405.Laptop is Connected");

    }

    @Override
    public void poweron() {
        System.out.println("day0405.Laptop is Power on");
    }
}
