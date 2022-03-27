import entity.Customer;

/**
 * Powered By:MINDARTLK.
 * version:v0.1.0
 **/

public class Demo {
    public static void main(String[] args) {
        /*System.out.println("era");*/

        Customer customer = new Customer();
        customer.setId("C001");
        customer.setName("gamage");
        customer.setAddress("galle");
        customer.setSalary(35000);

        save(customer);

    }
}
