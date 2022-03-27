import entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

/**
 * Powered By:MINDARTLK.
 * version:v0.1.0
 **/

public class Demo {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId("C002");
        customer.setName("amesh");
        customer.setAddress("ahangama");
        customer.setSalary(35000);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        session.close();
    }
}
