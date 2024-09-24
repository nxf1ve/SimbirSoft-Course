package lection_1;

public class SportCar extends Car implements IMaintenance {
    private boolean hasTurbo;
    public void setHasTurbo(boolean state) {
        hasTurbo = state;
    }
    public boolean getHasTurbo() {
        return hasTurbo;
    }
    private boolean hasSpoiler;
    public void setHasSpoiler(boolean state) {
        hasSpoiler = state;
    }
    public boolean getHasSpoiler() {
        return hasSpoiler;
    }

    public SportCar(String brand, String model, int year, int maxSpeed, double price, boolean hasSpoiler, boolean hasTurbo) {
        super(brand, model, year, maxSpeed, price);
        this.hasSpoiler = hasSpoiler;
        this.hasTurbo = hasTurbo;
    }

    public void toggleSpoiler(boolean state) {
        setHasSpoiler(state);
        if (getHasSpoiler()) {
            System.out.println("Спойлер установлен.");
        } else {
            System.out.println("Спойлер снят.");
        }
    }
    @Override
    public void drive() {
        if (getHasTurbo() && getHasSpoiler()) {
            System.out.println("Турбо активировано, спойлер установлен, спорткар едет");
        }
        else if (getHasSpoiler() && !getHasTurbo()) {
            System.out.println("Спойлер установлен, турбо нет, спорткар едет");
        }
        else if (!getHasSpoiler() && getHasTurbo()) {
            System.out.println("Турбо активировано, спойлер не установлен, спорткар едет");
        }
        else {
            System.out.println("Турбо не активировано, спойлер не установлен, Турбо активировано, спойлер не установлен, спорткар едет едет");
        }
    }

    @Override
    public void checkBattery() {
        System.out.println("Спорткар не имеет батареи.");
    }

    @Override
    public void serviceEngine() {
        System.out.println("Обслуживаем двигатель.");
    }

}
