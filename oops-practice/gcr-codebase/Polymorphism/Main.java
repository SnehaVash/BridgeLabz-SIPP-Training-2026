package Polymorphism;

public class Main {
    public static void main(String[] args) {
        double distance = 100;

        Vehicle[] fleet = {  //upcasting
                new Bike("BIKE101"),
                new Car("CAR102"),
                new Bus("BUS103")
        };

        for(Vehicle v : fleet) {
            System.out.println("The Vehicle number is: " + v.VehicleNumber);
            System.out.println("Cost per " + distance + " is: " + v.fuelCost(distance));

            //To know what vehicle we are using
            if (v instanceof Car) {
                System.out.println("This is a Car!");
            } else if (v instanceof Bike) {
                System.out.println("This is a bike!");
            } else if (v instanceof Bus) {
                System.out.println("This is a Bus!");
            } else {
                System.out.println("Invalid Vehicle Type!");
            }
        }
    }
}
