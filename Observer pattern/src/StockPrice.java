
import java.util.ArrayList;
import java.util.List;


class StockPrice {
    private List<Customer> customers = new ArrayList<>();
    private String message;

    public void attach(Customer customer) {
        customers.add(customer);
    }

    public void notifyAllObservers() {
        for (Customer customer : customers) {
            customer.update(message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
        notifyAllObservers();
    }
}
