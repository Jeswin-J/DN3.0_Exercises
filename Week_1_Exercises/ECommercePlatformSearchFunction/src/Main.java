import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String searchKey;
        Product foundProduct;

        Product[] products = {
                new Product("PROD01", "Laptop", "Electronics"),
                new Product("PROD02", "Smartphone", "Electronics"),
                new Product("PROD03", "Paper", "Stationary"),
                new Product("PROD04", "Chair", "Furniture"),
                new Product("PROD05", "Shirt", "Clothing"),
                new Product("PROD05", "Football", "Sports")
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product to Search: ");
        searchKey = sc.nextLine();

        System.out.println("Applying Linear Search...\n");
        foundProduct = SearchFunction.linerSearch(products, searchKey);

        if(foundProduct != null){
            System.out.println("Product ID: " + foundProduct.getProductId());
            System.out.println("Product Name: " + foundProduct.getProductName());
            System.out.println("Product Category: " + foundProduct.getCategory());
        } else {
            System.out.println("404! No such Product Found!");
        }

        System.out.println("\nApplying Binary Search...\n");
        foundProduct = SearchFunction.binarySearch(products, searchKey);

        if(foundProduct != null){
            System.out.println("Product ID: " + foundProduct.getProductId());
            System.out.println("Product Name: " + foundProduct.getProductName());
            System.out.println("Product Category: " + foundProduct.getCategory());
        } else {
            System.out.println("404! No such Product Found!");
        }

        sc.close();
    }
}
