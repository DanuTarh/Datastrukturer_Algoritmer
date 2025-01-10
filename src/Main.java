public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car("Toyota", 5000);
        Vehicle bike = new Bike("Scott");

        Car car2 = new Car("Fiat");
        Car car3 = new Car(20000.00);

        car2.refuel();
        Vehicle todaysVehicle = car;
        todaysVehicle = car;
        //upcasting

        todaysVehicle = bike;

        // car.setPrice(-1000000.00);
        System.out.println("i dag åker jag " + todaysVehicle.getName());
        System.out.printf("%s kostar %.2f\n" , car.getName(), car.getPrice());
        System.out.println(car.soundWarning());

        System.out.printf("%s kostar %.2f\n" , car2.getName(), car2.getPrice());
        System.out.printf("%s kostar %.2f\n" , car3.getName(), car3.getPrice());



        System.out.println("" + car2.getName() + " is " + car2.getType());
        System.out.println(bike.getName() + " is " + bike.getType());
        System.out.println(bike.soundWarning());



    }
}