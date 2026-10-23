package com.pluralsight;
import java.util.*;

public class Vehicle {

    private long vehicleId;
    private String makeModel;
    private String color;
    private int odometerReading;
    private double price;

    public Vehicle(long vehicleId, String makeModel, String color, int odometerReading, double price) {
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }

    @Override
    public String toString() {
        return """
            ==Vehicle==
        - Vehicle ID: %d
        - Make and Model: %s
        - Color: %s
        - Odometer Reading: %d
        - Price: %s
        """.formatted(vehicleId, makeModel, color, odometerReading, price);
    }

    // Print all vehicles from array
    public static void listAllVehicles(int vehicleCount, Vehicle[] vehicleList) {
        for (int i = 0; i < vehicleCount; i++) {
            System.out.println(vehicleList[i].getMakeModel());
            
        }
    }
    public static void findVehiclesByMakeModel(Vehicle[] vehicleList, int vehicleCount, Scanner scanner) {
        System.out.println("==Find Vehicle by Make and Model==");
        boolean vehicleFound = false;
        System.out.println("Enter make and model: ");
        String inputMakeModel = scanner.nextLine();
        for (int i = 0; i < vehicleCount; i++) {
            if (inputMakeModel.equals(vehicleList[i].getMakeModel())) {
                System.out.printf("Yes we have a %s for $%,.2f", vehicleList[i].getMakeModel(), vehicleList[i].getPrice());
                vehicleFound = true;
            }
        }
        if (vehicleFound == false) {
            System.out.println("Sorry, that car is unavailable :(");
        }
        }

    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
