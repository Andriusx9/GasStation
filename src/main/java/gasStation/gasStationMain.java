package gasStation;

import java.util.Scanner;

public class gasStationMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fuelCount;
        int selectedFuel;
        int selectedPumpNr;
        int with;

        FuelTypes fueltype1 = new FuelTypes("Petrol", 1.5);
        FuelTypes fueltype2 = new FuelTypes("Diesel", 1.2);
        FuelTypes fueltype3 = new FuelTypes("Gas", 0.8);

        System.out.println("<GAS Station>\nChoose fuel type:");
        System.out.println("1. " + fueltype1.getFuelType() + ", price: " + fueltype1.getFuelPrice());
        System.out.println("2. " + fueltype2.getFuelType() + ", price: " + fueltype2.getFuelPrice());
        System.out.println("3. " + fueltype3.getFuelType() + ", price: " + fueltype3.getFuelPrice());

        selectedFuel = scan.nextInt();
        Receipt receipt = new Receipt();

        if(selectedFuel == 1) {
            System.out.println("You chose - " + fueltype1.getFuelType() + ", price: " + fueltype1.getFuelPrice());
            receipt.setFuelTypesFill(fueltype1);
        } else if(selectedFuel == 2){
            System.out.println("You chose - " + fueltype2.getFuelType() + ", price: " + fueltype2.getFuelPrice());
            receipt.setFuelTypesFill(fueltype2);
        } else if(selectedFuel == 3){
            System.out.println("You chose - " + fueltype3.getFuelType() + ", price: " + fueltype3.getFuelPrice());
            receipt.setFuelTypesFill(fueltype3);
        }



    }
}
