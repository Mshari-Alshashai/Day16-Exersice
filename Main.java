import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean running = true;
        List<Vehicle> rentedVehicles = new ArrayList<>();



      while(running) {

          System.out.println("Vehicle Rental System");
          System.out.println("1. Rent a Car");
          System.out.println("2. Rent a Bike");
          System.out.println("3. Rent a Truck");
          System.out.println("4. View Rented Vehicles");
          System.out.println("5. Exit");

          switch (sc.nextInt()) {

              case 1:
                  System.out.println("Enter Car Model:");
                  sc.nextLine();
                  String carModel = sc.nextLine();
                  System.out.println("Enter Rental Days:");
                  int days = sc.nextInt();
                  rentedVehicles.add(new Car(carModel, days));
                  System.out.println("Rental Details:");
                  rentedVehicles.getLast().displayDetails();
                  break;
              case 2:
                  System.out.println("Enter Bike Brand:");
                  sc.nextLine();
                  String bikeBrand = sc.nextLine();
                  System.out.println("Enter Rental Hours:");
                  int hour = sc.nextInt();
                  rentedVehicles.add(new Bike(bikeBrand, hour));
                  System.out.println("Rental Details:");
                  rentedVehicles.getLast().displayDetails();
                  break;
              case 3:
                  System.out.println("Enter Truck Type:");
                  sc.nextLine();
                  String truckType = sc.nextLine();
                  System.out.println("Enter Rental Weeks:");
                  int week = sc.nextInt();
                  rentedVehicles.add(new Truck(truckType, week));
                  System.out.println("Rental Details:");
                  rentedVehicles.getLast().displayDetails();
                  break;
              case 4:
                  for (Vehicle v : rentedVehicles) {
                      v.displayDetails();
                  }
                  break;
              case 5:
                  running = false;
                  System.out.println("Thank you for using the Vehicle Rental System!");
                  break;
              default:
                  System.out.println("Enter a number from 1 to 5 please");
          }
          System.out.println("*********************************");
      }






    }
}