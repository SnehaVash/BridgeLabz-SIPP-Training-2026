package Polymorphism;

public class Car extends Vehicle {

    public Car(String vechileNumber) {
        super(vechileNumber);
    }

    @Override
    public double fuelCost(double km) {
        return km*10;
    }
}
