import Interfaces.IMaintenance;

public class ElectricCar extends Car implements IMaintenance {
    private int batteryCapacity;
    private int batteryLevel;

    public ElectricCar(String brand, String model, int year, int maxSpeed, double price, int batteryCapacity) {
        super(brand, model, year, maxSpeed, price);
        this.batteryCapacity = batteryCapacity;
        this.batteryLevel = 100;
    }

    @Override
    public void drive() {
        if (batteryLevel > 0) {
            System.out.println("Электрокар едет.");
            batteryLevel -= 10;
        } else {
            System.out.println("Батарея пуста. Нужна зарядка");
        }
    }

    public void chargeBattery() {
        System.out.println("Зарядка батареи...");
        batteryLevel = 100;
        System.out.println("Батарея заряжена.");
    }

    @Override
    public void checkBattery() {
        System.out.println("Уровень батареи: " + batteryLevel + "%");
    }

    @Override
    public void serviceEngine() {
        System.out.println("Электрокар не имеет традиционный двигатель.");
    }


}
