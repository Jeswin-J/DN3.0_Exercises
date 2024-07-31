public class Customer {
    private static int count;
    private final String customerId;
    private final String name;

    Customer(String name){
        this.name = name;
        this.customerId = "CUST_" + count++;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String toString(){
        return "Customer Id: " + this.customerId + " Name: " + this.name;
    }
}
