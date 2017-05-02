//CarLot class

import java.util.ArrayList;


public class CarLot {

    ArrayList<Car> carList = new ArrayList<>();  //create ArrayList

    //userInput add to the newCar List

    public void addNewCar(String make, String model, int year, double price) {
        carList.add(new Car(make, model, year, price));
    }

  //userInput add to the usedCar List

    public void addUsedCar(String make, String model, int year, double price, int mileage) {
        carList.add(new UsedCar(make, model, year, price, mileage));
    }

  // creating collectAllCarsInCarLot()

    public void collectAllCarsInCarLot() {
        for (Car c : carList) {
            if (c instanceof UsedCar) {
                System.out.println(c + "\tUsed Car");

            } else {
                System.out.println(c + "\t\tNew Car");
            }

        }

    }

}






