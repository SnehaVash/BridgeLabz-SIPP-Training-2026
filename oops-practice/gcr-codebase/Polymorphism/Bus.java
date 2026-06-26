package Polymorphism;

public class Bus extends Vehicle {

    public Bus(String vechileNumber) {
        super(vechileNumber);
    }

    @Override
    public double fuelCost(double km) {
        return km*15;
    }
}
