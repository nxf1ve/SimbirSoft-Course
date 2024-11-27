
import lection_3.Car;
import lection_3.ElectricCar;
import lection_3.Fleet;
import lection_3.Truck;


public class Main {
    public static void main(String[] args) {
        Truck truck1 = new Truck("Volvo", "FMX", 2021, 120, 90000, 2000);
        ElectricCar electricCar = new ElectricCar("Tesla", "Model S", 2020, 250, 79999, 100);

        Fleet<Car> fleet = new Fleet<>();
        fleet.addCar(truck1);
        fleet.addCar(electricCar);
        fleet.printCarsInfo();
    }
}
