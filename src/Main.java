public class Main {
    public static void main(String[] args) {

        Car car = new Car("Toyota");
        Car otherCar = new Car("volkswagen");
        System.out.println("Let the battle begin "
                + car.getName() + " " + otherCar.getName());
        car.setName("KIA");
        System.out.println("New name : " + car.getName());



    }
}