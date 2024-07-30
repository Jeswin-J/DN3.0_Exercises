import java.util.HashMap;

public class Inventory {
    private HashMap<String, Product> products;

    Inventory(){
        products = new HashMap<>();
    }

    public String addProduct(Product product){
        products.put(product.getProductId(), product);
        return product.getProductId();
    }

    public Product getProduct(String id){
        return products.get(id);
    }

    public boolean updateProduct(String id, String name, int quantity, double price){
        Product product = products.get(id);

        if(product != null){
            product.setProductName(name);
            product.setQuantity(quantity);
            product.setPrice(price);
            return true;
        } else {
            System.out.println("404! Product Not Found!");
            return false;
        }
    }

    public boolean removeProduct(String id){
        if (products.containsKey(id)){
            products.remove(id);
            return true;
        } else {
            System.out.println("Invalid Product Id");
            return false;
        }
    }
}
