import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double initialValue, growthRate, forecast;
        int period;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Initial Value: ");
        initialValue = sc.nextDouble();
        System.out.print("Enter Growth Rate: ");
        growthRate = sc.nextDouble();
        System.out.print("Enter Period: ");
        period = sc.nextInt();
        sc.close();

        forecast = FinancialForecast.calculateFutureValue(initialValue, growthRate, period);
        System.out.println("Forecasted value after " + period + " years is " + forecast);

    }
}
