import lection_2.Authorization;
import lection_3.Car;
import lection_3.ElectricCar;
import lection_3.Fleet;
import lection_3.Truck;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        SportCar porsche = new SportCar("Porsche", "911", 2022, 320, 180000, true, false);
//        porsche.printInfo();
//        porsche.drive();
//        porsche.setHasTurbo(true);
//        porsche.toggleSpoiler(false);
//        porsche.drive();
//        porsche.serviceEngine();
//        System.out.println("\n==============================================================================\n");
//
//        Truck volvoTruck = new Truck("Volvo", "FH16", 2020, 120, 80000, 40000);
//        volvoTruck.printInfo();
//        volvoTruck.drive();
//        volvoTruck.loadCargo(35000);
//        volvoTruck.loadCargo(1000);
//        volvoTruck.unloadCargo();
//        volvoTruck.serviceEngine();
//        System.out.println("\n==============================================================================\n");
//
//        ElectricCar tesla = new ElectricCar("Tesla", "Model S", 2023, 250, 100000, 1800);
//        tesla.printInfo();
//        tesla.drive();
//        tesla.drive();
//        tesla.checkBattery();
//        System.out.println("\n==============================================================================\n");
//        Car.printCarsInfo();
//        Authorization login = new Authorization();
//        System.out.println(login.login("adminп", "admin", "admin"));

        Truck truck1 = new Truck("Volvo", "FMX", 2021, 120, 90000, 2000);
        ElectricCar electricCar = new ElectricCar("Tesla", "Model S", 2020, 250, 79999, 100);

        Fleet<Car> fleet = new Fleet<>();
        fleet.addCar(truck1);
        fleet.addCar(electricCar);
        fleet.printCarsInfo();

    }
}