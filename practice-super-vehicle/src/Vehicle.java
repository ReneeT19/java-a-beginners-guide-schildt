public class Vehicle {
    private int passengers;
    private int fuelcap;
    private int mpg;

    //constructor for Vehicle
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    int range() {
        return mpg * fuelcap;
    }
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

    //accessor methods
    int getPassengers() {
        return passengers;
    }
    int getFuelcap() {
        return fuelcap;
    }
    int getMpg() {
        return mpg;
    }
    void setPassengers(int p) {
        passengers = p;
    }
    void setFuelcap(int f) {
        fuelcap = f;
    }
    void setMpg(int m) {
        mpg = m;
    }
}
