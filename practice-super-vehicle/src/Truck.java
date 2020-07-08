class Truck extends Vehicle {
    private int cargocap;

    //a constructor for Truck
    Truck(int p, int f, int m, int c) {
        //initialize Vehicle members using Vehicle's constructor
        super(p,f,m);
        cargocap = c;
    }
    //accessors for cargocap
    int getCargocap() {
        return cargocap;
    }
    void setCargocap(int c) {
        cargocap = c;
    }
}
