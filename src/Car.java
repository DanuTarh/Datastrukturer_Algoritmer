public class Car extends Vehicle {
    private int fuel = 0;

    //overload överlagring.
    public Car(String name){
        super(name, "Motorized");
        super.setPrice(10000.0);
    }

    public Car(double price){
        super("default-car", "Motorized");
        super.setPrice(10000.0);
    }
    public Car(String name, double price) {
        super(name, "Motorized");
        super.setPrice(price);

    }

    @Override
    public String soundWarning() {
        return "tut-tut";
    }



    public void refuel() {
        this.fuel = 100;
    }

}
