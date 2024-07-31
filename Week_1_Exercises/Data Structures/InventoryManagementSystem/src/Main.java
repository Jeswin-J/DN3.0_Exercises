import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Product p, foundProduct;
        int productCount;
        String id, searchId;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product count: ");
        productCount = sc.nextInt();
        Inventory inventory = new Inventory();

        while(productCount > 0){
            sc.nextLine();
            System.out.println("Enter Product Name, Quantity and Price");
            p = new Product(sc.nextLine(), sc.nextInt(), sc.nextDouble());
            id = inventory.addProduct(p);
            System.out.println("\nSuccess! Product ID: " + id + "\n");
            productCount--;
        }

        sc.nextLine();
        System.out.print("Enter Search Product Id: ");
        searchId = sc.nextLine();

        foundProduct = inventory.getProduct(searchId);

        System.out.println("\nProduct ID: " + foundProduct.getProductId());
        System.out.println("Product Name: " + foundProduct.getProductName());
        System.out.println("Product Quantity: " + foundProduct.getQuantity());
        System.out.println("Product Price: " + foundProduct.getPrice());

        System.out.print("Enter Product ID to Update: ");

        searchId = sc.nextLine();

        System.out.println("Enter Product Name, Quantity and Price");
        inventory.updateProduct(searchId, sc.nextLine(), sc.nextInt(), sc.nextDouble());

        foundProduct = inventory.getProduct(searchId);

        System.out.println("\nProduct ID: " + foundProduct.getProductId());
        System.out.println("Product Name: " + foundProduct.getProductName());
        System.out.println("Product Quantity: " + foundProduct.getQuantity());
        System.out.println("Product Price: " + foundProduct.getPrice());

        sc.close();
    }
}
