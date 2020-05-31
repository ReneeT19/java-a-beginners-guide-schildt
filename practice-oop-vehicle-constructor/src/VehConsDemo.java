class Vehicle {
    //specify the fields/instance variables
    int passengers;
    int fuelcap;
    int mpg;
    //give a parameterized constructor
    Vehicle(int p, int f, int m) {  // the constructor has the same name as the class
        passengers = p;
        fuelcap = f;
        mpg = m;
    }
    // one method: return the range
    int range() {
        return mpg * fuelcap;
    }
    //another method: parameterized method to calculate fuelneeded
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

public class VehConsDemo {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle(7, 16, 21); //each object is initialized as specified in the parameters to its constructor
        Vehicle sportscar = new Vehicle(2, 14, 12);
        System.out.println("To go 252 miles minivan needs " + minivan.fuelneeded(252) + " gallons of fuel.");
        System.out.print("To go 252 miles sportscar needs " + sportscar.fuelneeded(252) + " gallons of fuel.");
    }
}
