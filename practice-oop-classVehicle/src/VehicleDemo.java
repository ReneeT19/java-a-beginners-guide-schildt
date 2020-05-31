class Vehicle {
    int passengers; //specify the instance variables or fields
    int fuelcap;
    int mpg;
}

public class VehicleDemo {  //only one public class should be used and its name should be the same as the .java name
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle(); //create one object called minivan
    int range;
    //assign values to fields in minivan
    minivan.passengers = 7;
    minivan.fuelcap = 16;
    minivan.mpg = 21;  //use the dot operator to access a member
    //compute the range assuming a full tank of gas
    range = minivan.fuelcap * minivan.mpg;
    System.out.println("Minivan can carry " + minivan.passengers + " passengers with a range " + range);
    }
} //you can run it by going to configuration on the top right and add application and choose VehicleDemo and ok
// you can create two or more objects by adding Vehicle sportscar = new Vehicle(); and copy the same procedure for minivan
