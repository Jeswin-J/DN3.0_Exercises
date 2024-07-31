import java.util.Objects;

public class CustomerRepositoryImpl implements CustomerRepository{
    @Override
    public Customer findCustomerById(String id) {
        Customer[] customers = {
                new Customer("Jeswin"),
                new Customer("Joseph"),
                new Customer("John"),
                new Customer("Joe")
        };

        for(Customer c : customers){
            if(Objects.equals(c.getCustomerId(), id)){
                return c;
            }
        }
        return null;
    }
}
