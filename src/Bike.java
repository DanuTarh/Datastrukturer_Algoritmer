public class Bike extends Vehicle {

    public Bike(String name) {
        super(name, "Pedalized");
        super.setPrice(700.00);
    }

    @Override
    public String soundWarning() {
        return "pling-pling";
    }

}
