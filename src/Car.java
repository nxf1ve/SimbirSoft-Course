public abstract class Car {
    protected String brand;
    protected String model;
    protected int year;
    protected int maxSpeed;
    protected double price;
    private static int carCount = 0;
    public Car(String brand, String model, int year, int maxSpeed, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.price = price;
        carCount++;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public abstract void drive();
    // Метод для вывода информации о машине
    public void printInfo() {
        System.out.println("Марка: " + brand + ", Модель: " + model + ", Год выпуска: " + year + ", Макс. скорость: " + maxSpeed + ", Цена: " + price);
    }

    // Статический метод для подсчета машин
    public static void printCarCount() {
        System.out.println("Всего машин: " + carCount);
    }
}
