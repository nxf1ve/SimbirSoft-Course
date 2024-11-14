package lection_1;

public class ElectricCar extends Car implements IMaintenance {
    private int batteryCapacity;
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        if (batteryCapacity > 0) {
            this.batteryCapacity = batteryCapacity;
        } else {
            System.out.println("Емкость батареи должна быть положительной.");
        }
    }
    private int batteryLevel;

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        if (batteryLevel >= 0 && batteryLevel <= 100) {
            this.batteryLevel = batteryLevel;
        } else {
            System.out.println("Уровень заряда должен быть в диапазоне от 0 до 100.");
        }
    }

    public ElectricCar(String brand, String model, int year, int maxSpeed, double price, int batteryCapacity) {
        super(brand, model, year, maxSpeed, price);
        this.batteryCapacity = batteryCapacity;
        this.batteryLevel = 100;
    }

    @Override
    public void drive() {
        if (getBatteryLevel() > 0) {
            System.out.println("Электрокар едет.");
            int consumption = calculateBatteryConsumption();
            setBatteryLevel(getBatteryLevel() - consumption);
        } else {
            System.out.println("Батарея пуста. Нужна зарядка.");
        }
    }

    // Метод для расчета расхода заряда батареи
    private int calculateBatteryConsumption() {
        int speed = getMaxSpeed();
        int consumption = Math.max(1, (int)(speed / (double)batteryCapacity * 10));
        return Math.min(consumption, getBatteryLevel()); // Расход не может быть > уровня батарея
    }

    public void chargeBattery() {
        System.out.println("Зарядка батареи...");
        setBatteryLevel(100);
        System.out.println("Батарея полностью заряжена.");
    }

    @Override
    public void checkBattery() {
        System.out.println("Уровень батареи: " + getBatteryLevel() + "%");
    }

    @Override
    public void serviceEngine() {
        System.out.println("Электрокар не имеет традиционный двигатель.");
    }


}
