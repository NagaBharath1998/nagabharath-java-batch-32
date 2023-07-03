package day0405;

public class Car extends Vehicle{
    private String model;
    public Car(String manufacturer, String model) {
        super(manufacturer);
        this.model = model;
    }
    public Car(String model){
        super("unknown");
        this.model=model;
    }
    public String getModel(){
        return model;
    }
}
