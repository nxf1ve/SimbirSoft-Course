package lection_3;

public abstract class Car {
    protected String brand;
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    protected String model;
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    protected int year;
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    protected int maxSpeed;
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    protected double price;
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Car(String brand, String model, int year, int maxSpeed, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public abstract void drive();

    public void printInfo() {
        System.out.println("Марка: " + getBrand() + ", Модель: " + getModel() +
                ", Год выпуска: " + getYear() + ", Макс. скорость: " +
                getMaxSpeed() + ", Цена: " + getPrice());
    }

}
