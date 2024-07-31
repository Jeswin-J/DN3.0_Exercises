import java.util.HashMap;

public class FinancialForecast {
    public static double calculateFutureValue(double initialValue, double growthRate, int period){
        HashMap<Integer, Double> map = new HashMap<>();

        if(period == 0){
            map.put(period, initialValue);
        } else {
            double result = calculateFutureValue(initialValue * (1 + growthRate), growthRate, period - 1);
            map.put(period, result);
        }
        return map.get(period);
    }
}
