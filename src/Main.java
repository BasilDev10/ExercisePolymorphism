import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        ArrayList<Vehicle> rentedVehicles = new ArrayList<>();
        int userInput = 0;
        String  vehicleName = "";
        do {
            System.out.println("Vehicle Rental System\n1.Rent a Car\n2.Rent a Bike\n3.Rent a Truck\n4.View Rented vehicle\n5.Exit");
            userInput = input.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println("Enter Car model: ");
                    vehicleName = input.next();
                    System.out.println("Enter rent days: ");
                    int rentDays = input.nextInt();
                    rentedVehicles.add(new Car(vehicleName, rentDays));
                    break;
                case 2:
                    System.out.println("Enter Bike brand: ");
                    vehicleName = input.next();
                    System.out.println("Enter rent hours: ");
                    int rentHours = input.nextInt();
                    rentedVehicles.add(new Bike(vehicleName, rentHours));
                    break;
                case 3:
                    System.out.println("Enter Truck type: ");
                    vehicleName = input.next();
                    System.out.println("Enter rent weeks: ");
                    int rentWeeks = input.nextInt();
                    rentedVehicles.add(new Truck(vehicleName, rentWeeks));
                    break;
                case 4:
                    System.out.println("Rented vehicles:");
                    for (Vehicle vehicle : rentedVehicles) {
                        System.out.println("-----------------------");
                        vehicle.displayDetails();
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
            }
            if (userInput == 5) {
                break;
            }

        }while (true);
    }
}