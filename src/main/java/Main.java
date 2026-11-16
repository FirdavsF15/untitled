public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        System.out.println(slowRide.getColor());
        System.out.println(slowRide.getFuelCapacity());


    }
}
