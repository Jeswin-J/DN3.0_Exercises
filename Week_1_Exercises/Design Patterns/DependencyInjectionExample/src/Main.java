import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomerRepository cr = new CustomerRepositoryImpl();

        //Dependency Injection
        CustomerService cs = new CustomerService(cr);

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Customer Id: ");
        Customer customer = cs.getCustomer(sc.nextLine());
        sc.close();

        System.out.println(customer);
    }
}
