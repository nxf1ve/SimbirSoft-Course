package lection_3;


public class FunctionalInterfaces {
    @FunctionalInterface
    public interface DivisibilityCheck {
        boolean isDivisibleBy13(int number);
    }

    @FunctionalInterface
    public interface DiscriminantCalculator {
        double calculate(double a, double b, double c);
    }

    public static void main(String[] args) {

        DivisibilityCheck divisibilityCheck = number -> number % 13 == 0;
        System.out.println("Число 26 делится на 13? " + divisibilityCheck.isDivisibleBy13(26));
        System.out.println("Число 27 делится на 13? " + divisibilityCheck.isDivisibleBy13(27));

        DiscriminantCalculator discriminantCalculator = (a, b, c) -> (b * b) - (4 * a * c);
        double result = discriminantCalculator.calculate(1.0, -3.0, 2.0);
        System.out.println("Дискриминант для коэффициентов a=1, b=-3, c=2: " + result);
    }
}
