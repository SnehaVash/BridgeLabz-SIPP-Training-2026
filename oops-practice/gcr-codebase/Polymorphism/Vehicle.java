package Polymorphism;

public abstract class Vehicle {
    protected String VehicleNumber;

    public Vehicle(String vehicleNumber) {
        VehicleNumber = vehicleNumber;
    }

    public abstract double fuelCost(double km); //Manadatory to Override when it is being extended in other class.
}
