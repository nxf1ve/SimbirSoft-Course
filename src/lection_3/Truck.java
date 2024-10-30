package lection_3;

public class Truck extends Car implements ICargoHandler<Double>, IMaintenance {
    private double cargoCapacity;
    public double getCargoCapacity() {
        return cargoCapacity;
    }
    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
    private double currentCargoWeight;
    public double getCurrentCargoWeight() {
        return currentCargoWeight;
    }
    public void setCurrentCargoWeight(double currentCargoWeight) {
        this.currentCargoWeight = currentCargoWeight;
    }

    public Truck(String brand, String model, int year, int maxSpeed, double price, double cargoCapacity) {
        super(brand, model, year, maxSpeed, price);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void drive() {
        if (getCurrentCargoWeight() > 0) {
            System.out.println("Грузовик едет с грузом");
        }
        else {
            System.out.println("Грузовик едет без груза");
        }
    }

    @Override
    public void loadCargo(Double weight) {
        if (weight + getCurrentCargoWeight() <= getCargoCapacity()) {
            setCurrentCargoWeight(getCurrentCargoWeight() + weight);
            System.out.println("Загрузка грузовика: " + weight + " кг, текущая загрузка: " + getCurrentCargoWeight() + " кг");
        } else {
            System.out.println("Грузовик загружен полностью!");
        }
    }

    @Override
    public void unloadCargo() {
        System.out.println("Выгружен груз весом: " + getCurrentCargoWeight() + " кг");
        setCurrentCargoWeight(0);
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
