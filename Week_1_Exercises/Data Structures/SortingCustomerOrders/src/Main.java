import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Order[] bSorted, qSorted;

        Order[] orders = {
                new Order("Jeswin", 53.030),
                new Order("Jake", 6070),
                new Order("Smith", 545.6),
                new Order("John Doe", 155.07),
                new Order("King", 4325.6),
                new Order("Ram", 942.6),
                new Order("Gupta", 625.6),
                new Order("Dhoni", 14.86)
        };

        System.out.println("Implementing Bubble Sort...");
        bSorted = SortingFunction.bubbleSort(orders);
        System.out.println(Arrays.toString(bSorted));

        System.out.println("Implementing Quick Sort...");
        qSorted = SortingFunction.quickSort(orders, 0, orders.length - 1);
        System.out.println(Arrays.toString(qSorted));

    }
}
