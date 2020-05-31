class Vehicle {
    //specify the fields/instance variables
    int passengers;
    int fuelcap;
    int mpg;

    //add a range() method within the Vehicle class; notice there is no parameter for range
    void range() {
        //add the body of method
        System.out.println("Range is " + fuelcap * mpg);
        //use fuelcap and mpg directly instead of using dot operator because when a method uses an instance variable defined
        //by its class, it uses it directly as a method is always invoked relative to some object of its class so the object is known.

        /** so far it's a void type, we can also use a return type to return the value: return the range
         * int range () {
         * return mpg * fuelcap;
         * }
         */
    }
}
 // the fields and methods go to the helper class; the variable values, if statements, and call functions go to main class
//you can also have just one class and then outside of the brackets have methods listed separately under private static (return type) (variable name) (optional parameter)

public class AddMeth {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        int range1, range2;
        //assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        //assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;
        System.out.print("Minivan can carry " + minivan.passengers + " passengers.");
        //call the method in here
        minivan.range();
        System.out.print("Sportscar can carry " + minivan.passengers + " passengers.");
        sportscar.range();
        /** instead of calling the method, to be consistent with the previous return value method, you can assign the value returned to a variable
         * range1 = minivan.range();   //the range of minivan object is stored in range1
         * range2 = sportscar.range();
         * System.out.print("Minivan can carry " + minivan.passengers + " passengers." + " with range of " + range1 + "miles.");
         * System.out.print("Sportscar can carry " + sportscar.passengers + " passengers." + " with range of " + range2 + "miles.");
         // or you can just use System...(...+ minivan.range () + ...) directly to call it in the printout function to have more efficient code
         */
    }
}
//use a call to range() whenever a range of a Vehicle object is needed. e,g, if(v1.range() < v2.range()) System...("v1 has greater range");
