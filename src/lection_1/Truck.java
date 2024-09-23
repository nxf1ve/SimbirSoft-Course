package lection_1;

public class Truck extends Car implements ICargoHandling, IMaintenance {
    private double cargoCapacity;
    private double currentCargoWeight;

    public Truck(String brand, String model, int year, int maxSpeed, double price, double cargoCapacity) {
        super(brand, model, year, maxSpeed, price);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void drive() {
        if (currentCargoWeight > 0) {
            System.out.println("Грузовик едет с грузом");
        }
        else {
            System.out.println("Грузовик едет без груза");
        }
    }

    @Override
    public void loadCargo(double weight) {
        if (weight <= cargoCapacity) {
            currentCargoWeight = weight;
            System.out.println("Загрузка грузовика: " + weight + " кг");
        } else {
            System.out.println("Грузовик загружен полностью!");
        }
    }

    @Override
    public void unloadCargo() {
        System.out.println("Выгружен груз весом: " + currentCargoWeight + " кг");
        currentCargoWeight = 0;
    }

    @Override
    public void checkBattery() {
        System.out.println("Грузовик не имеет батарею, как у электрокара.");
    }

    @Override
    public void serviceEngine() {
        System.out.println("Обслуживание двигателя.");
    }
}
