package NeedForSpeedPack;

public class Vehicle {
    private final static double DEFAULT_FUEL_CONSUMPTION = 1.25 ;
    private double fuelConsumption;
    private double fuel;
    private int horsePower;

    public Vehicle(double fuel, int horsePower) {
        this.fuel = fuel;
        this.horsePower = horsePower;
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);

    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public static double getDefaultFuelConsumption() {
        return DEFAULT_FUEL_CONSUMPTION;
    }

    public double getFuelConsumption() {
        return this.fuelConsumption;
    }

    public double getFuel() {
        return this.fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void drive(double kilometers){
        double temp = this.getFuel() - this.getFuelConsumption() * kilometers;
        if (temp <=0){
            throw new IllegalArgumentException("No enough fuel for driving");
        }else {
            this.setFuel(temp);
            //double tt = getFuel();
            System.out.println();
        }

    }
}
