public class Order {
    private static int count = 0;
    private String orderId;
    private String customerName;
    private double totalPrice;

    Order(String customerName, double totalPrice){
        setOrderId("ORDER_" + count);
        setCustomerName(customerName);
        setTotalPrice(totalPrice);
        count++;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return " Order ID: " + getOrderId() + " Total Amt: " + getTotalPrice() + " Customer: " + getCustomerName() + "\n";
    }
}
