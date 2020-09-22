package NeedForSpeedPack;

public class Main {
    public static void main(String[] args) {
        double fuel = 0;
        int hP = 150;

        SportCar sc = new SportCar(fuel, hP);
        sc.drive(2.0);
        System.out.println(sc.getFuel());
    }
}
