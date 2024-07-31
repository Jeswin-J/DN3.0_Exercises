import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class SearchFunction {
    public static Product linerSearch(Product[] products, String searchKey){
        for(Product product : products){
            if(Objects.equals(product.getProductName(), searchKey)){
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String searchKey){
        Arrays.sort(products, Comparator.comparing(Product::getProductName));

        int left = 0;
        int right = products.length - 1;

        while (left <= right){
            int mid = (left + right) / 2;
            int comparison = products[mid].getProductName().compareToIgnoreCase(searchKey);

            if(comparison == 0){
                return products[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }
}
