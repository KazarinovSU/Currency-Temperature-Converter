import java.util.Scanner;

public class Converter {

    public static final double USD = 79.0;
    public static final double EUR = 90.0;

    public static double rubToUsd(double rub) {
        return rub / USD;
    }

    public static double usdToRub(double usd) {
        return usd * USD;
    }

    public static double rubToEur(double rub) {
        return rub / EUR;
    }

    public static double eurToRub(double eur) {
        return eur * EUR;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Конвертер:" +
                "\n1.Температура" +
                "\n2.Валюта" +
                "\nВаш выбор: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.print("Температура:" +
                        "\n1. Цельсий -> Фаренгейт" +
                        "\n2. Фаренгейт -> Цельсий" +
                        "\nВыбор: ");
                int tempChoice = scanner.nextInt();
                switch (tempChoice) {
                    case 1 -> {
                        System.out.print("Введите температуру цельсий: ");
                        double celsius = scanner.nextDouble();
                        System.out.print("Фаренгейт: " + celsiusToFahrenheit(celsius));
                    }
                    case 2 -> {
                        System.out.print("Введите температуру фаренгейт: ");
                        double fahrenheit = scanner.nextDouble();
                        System.out.print("Цельсий: " + fahrenheitToCelsius(fahrenheit));
                    }
                    default -> System.out.println("Некорректный выбор.");
                }
            }
            case 2 -> {
                System.out.print("Валюта: " +
                        "\n1. RUB -> USD " +
                        "\n2. RUB -> EUR " +
                        "\n3. USD -> RUB " +
                        "\n4. EUR -> RUB " +
                        "\nВыбор: ");
                int currencyChoice = scanner.nextInt();

                System.out.print("Введите сумму: ");
                double amount = scanner.nextDouble();
                switch (currencyChoice) {
                    case 1 -> System.out.print("USD: " + rubToUsd(amount));
                    case 2 -> System.out.print("EUR: " + rubToEur(amount));
                    case 3 -> System.out.print("RUB: " + usdToRub(amount));
                    case 4 -> System.out.print("RUB:" + eurToRub(amount));
                    default -> System.out.println("Некорректный выбор.");
                }
            }
            default -> System.out.println("Некорректный выбор.");
        }
        scanner.close();
    }
}