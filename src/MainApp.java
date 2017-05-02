//created by Saritha on 04/21/17

import java.util.Scanner;

//Create MainApp class

public class MainApp {
    public static void main(String[] args) {

        CarLot carLot = new CarLot();

        for (int i = 0; i < 2; i++) {
            getCarDetailsFromTheUser(carLot);
        }
        carLot.collectAllCarsInCarLot();
    }

    private static void getCarDetailsFromTheUser(CarLot carLot) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your car details: ");
        String userInput = scan.nextLine();

        System.out.println("Is the car New or Used?: ");
        userInput = scan.next();
        boolean newCar = userInput.equalsIgnoreCase("new");


        System.out.println("What is the car make?: ");
        String make = scan.next();

        System.out.println("What is the car model?: ");
        String model = scan.next();

        System.out.println("What is the car year?: ");
        int year = scan.nextInt();

        System.out.println("what is the car price?: ");
        double price = scan.nextDouble();

        System.out.println("What is the car mileage?: ");
        int mileage = scan.nextInt();


        if (newCar) {
            carLot.addNewCar(make, model, year, price);
            System.out.println(newCar);
        } else {
            carLot.addUsedCar(make, model, year, price, mileage);
            System.out.println();

        }


    }


}
