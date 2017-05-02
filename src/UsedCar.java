//UsedCar class

public class UsedCar extends Car { // add extends, can take all info. from car class

    private int mileage; //create mileage variable

    public UsedCar(String make, String model, int year, double price) {
        super(make, model, year, price);
    }
    // mileage Constructor

    public UsedCar(String make, String model, int year, double price, int mileage) {
        super(make, model, year, price);
        this.mileage = mileage;
    }
    //override for mileage

    @Override
    public String toString() {
        return super.toString() + "\t" + mileage;
    }
}
