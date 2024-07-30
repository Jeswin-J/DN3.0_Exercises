public class Product {
    private String productId;
    private String productName;
    private String category;

    Product(String productId, String productName, String category){
        setProductId(productId);
        setProductName(productName);
        setCategory(category);
    }


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
