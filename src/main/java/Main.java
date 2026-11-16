public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

//        Moped slowRide = new Moped();
//        slowRide.setColor("Red");
//        slowRide.setFuelCapacity(5);

//        System.out.println(slowRide.getColor());
//        System.out.println(slowRide.getFuelCapacity());

        System.out.println("Using constructors: ");

        System.out.println("Moped:");

        Moped slowRide = new Moped("Red", 1, 0, 5);

        System.out.println(slowRide.getColor());
        System.out.println(slowRide.getFuelCapacity());

        System.out.println("\nCar:");

        Car hondeezy = new Car("Black", 5, 1, 15);

        System.out.println(hondeezy.getColor());
        System.out.println(hondeezy.getNumberOfPassengers());

    }
}
