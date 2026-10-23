package com.pluralsight;
import java.util.*;

public class VehicleMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vehicleCount = 6;

        Vehicle[] vehicleList = new Vehicle[20];
        vehicleList[0] = new Vehicle(101121, "Ford Explorer", "Red",
                4500, 13500);
        vehicleList[1] = new Vehicle(101122, "Toyota Camry", "Blue",
                60000, 1100);
        vehicleList[2] = new Vehicle(101123, "Chevrlolet Malibu", "Black",
                50000, 9700);
        vehicleList[3] = new Vehicle(101124, "Honda Civic", "White",
                70000, 7500);
        vehicleList[4] = new Vehicle(101125, "Subaru Outback", "Green",
                55000, 14500);
        vehicleList[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow",
                30000, 16000);

        System.out.println("What do you want to do?");
        System.out.println(" 1 - List all vehicles");
        System.out.println(" 2 - Search by make/model");
        System.out.println(" 3 - Search by price range");
        System.out.println(" 4 - Search by color");
        System.out.println(" 5 - Add a vehicle");
        System.out.println(" 6 - Quit");
        System.out.println("Enter your command: ");

        int command = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        for (int i = 0; i < vehicleCount; i++) {
            System.out.println(vehicleList[i]);
        }

//        Vehicle.listAllVehicles(vehicleCount, vehicleList);

//        Vehicle.findVehiclesByMakeModel(vehicleList, vehicleCount, scanner);

    }
}
