package abstractfactory2;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new ElectricVehicleFactory();

        Car car = factory.createCar();
        Bike bike = factory.createBike();

        car.manufacture(); // Output: Driving an electric car.
        bike.manufacture(); // Output: Riding an electric bike.
    }
}
