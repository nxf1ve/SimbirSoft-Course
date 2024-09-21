import java.util.ArrayList;
import java.util.List;

public abstract class Car {
    protected String brand;
    protected String model;
    protected int year;
    protected int maxSpeed;
    protected double price;
    private static int carsCount = 0;
    private static List<Car> carsList = new ArrayList<>();
    public Car(String brand, String model, int year, int maxSpeed, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.price = price;
        carsCount++;
        carsList.add(this);
    }

    public abstract void drive();

    public void printInfo() {
        System.out.println("Марка: " + brand + ", Модель: " + model + ", Год выпуска: " + year + ", Макс. скорость: " + maxSpeed + ", Цена: " + price);
    }

    public static void printCarsCount() {
        System.out.println("Всего машин: " + carsCount);
    }
    public static void printCarsInfo() {
        System.out.println("Всего машин: " + carsCount + ", вот они:");
        for (Car car : carsList) {
            car.printInfo();
        }
    }

}
