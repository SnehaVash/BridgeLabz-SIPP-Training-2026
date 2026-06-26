package Polymorphism;

public class Bike extends Vehicle {

    public Bike(String vechileNumber) {
        super(vechileNumber);
    }

    @Override
    public double fuelCost(double km) {
        return km*3;
    }
}
