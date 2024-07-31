import java.util.Arrays;

public class SortingFunction {
    public static Order[] bubbleSort(Order[] orders){

        Order tempObj;

        for(int i = 0; i < orders.length; i++){
            for(int j = 0; j < orders.length - i - 1; j++){
                if(orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()){
                    tempObj = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = tempObj;
                }
            }
        }

        return orders;
    }

    public static int partition(Order[] orders, int low, int high){
        double pivot = orders[high].getTotalPrice();
        Order tempObj, temp;
        int i = low - 1;

        for(int j = low; j < high; j++){
            if(orders[j].getTotalPrice() <= pivot){
                i++;

                tempObj = orders[i];
                orders[i] = orders[j];
                orders[j] = tempObj;
            }
        }

        temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1;
    }

    public static Order[] quickSort(Order[] orders, int low, int high){
        if(low < high){
            int pi = partition(orders, low, high);

            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }

        return orders;
    }
}
