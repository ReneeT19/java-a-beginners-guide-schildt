class Vehicle {
    //specify the fields/instance variables
    int passengers;
    int fuelcap;
    int mpg;
//one method
    int range() {
        return mpg * fuelcap;
    }
//another method
    //this method has a parameter miles to calculate the fuel needed based on the distance you drive
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

public class CompFuel {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        System.out.println("To go 252 miles minivan needs " + minivan.fuelneeded(252) + " gallons of fuel.");
//call the method here using minivan.fuelneeded(initialize the variable) instead of creating more variables
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;
        System.out.print("To go 252 miles sportscar needs " + sportscar.fuelneeded(252) + " gallons of fuel.");
    }
}

