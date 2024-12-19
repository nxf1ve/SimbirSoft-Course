package lection_3;

import java.util.ArrayList;
import java.util.List;

public class Fleet<T extends Car> {
    private List<T> carsList = new ArrayList<>();
    public List<T> getAllCars() {
        return new ArrayList<>(carsList);
    }

    public void addCar(T car) {
        carsList.add(car);
    }

    public void removeCar(T car) {
        carsList.remove(car);
    }

    public void printCarsCount() {
        System.out.println("Всего машин в автопарке: " + carsList.size());
    }

    public void printCarsInfo() {
        System.out.println("Список машин в автопарке:");
        for (T car : carsList) {
            car.printInfo();
        }
    }

    public T getMostExpensiveCar() {
        T mostExpensive = null;
        for (T car : carsList) {
            if (mostExpensive == null || car.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = car;
            }
        }
        return mostExpensive;
    }

    public double calculateTotalValue() {
        double totalValue = 0;
        for (T car : carsList) {
            totalValue += car.getPrice();
        }
        return totalValue;
    }
}
