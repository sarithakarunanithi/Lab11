//Create Car class

public class Car {
    // Creating instance variable

    private String make;
    private String model;
    private int year;
    private double price;

    //create constructor

    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    //create getter and setter

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //Create Override
    @Override
    public String toString() {
        return make + "\t" + model + "\t" + year + "\t" + price + "\t";
    }
}
