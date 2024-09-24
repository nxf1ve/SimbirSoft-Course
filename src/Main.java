import lection_1.Car;
import lection_1.ElectricCar;
import lection_1.SportCar;
import lection_1.Truck;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SportCar porsche = new SportCar("Porsche", "911", 2022, 320, 180000, true, false);
        porsche.printInfo();
        porsche.drive();
        porsche.setHasTurbo(true);
        porsche.toggleSpoiler(false);
        porsche.drive();
        porsche.serviceEngine();
        System.out.println("\n==============================================================================\n");

        Truck volvoTruck = new Truck("Volvo", "FH16", 2020, 120, 80000, 40000);
        volvoTruck.printInfo();
        volvoTruck.drive();
        volvoTruck.loadCargo(35000);
        volvoTruck.loadCargo(1000);
        volvoTruck.unloadCargo();
        volvoTruck.serviceEngine();
        System.out.println("\n==============================================================================\n");

        ElectricCar tesla = new ElectricCar("Tesla", "Model S", 2023, 250, 100000, 1800);
        tesla.printInfo();
        tesla.drive();
        tesla.drive();
        tesla.checkBattery();
        System.out.println("\n==============================================================================\n");
        Car.printCarsInfo();



    }
}