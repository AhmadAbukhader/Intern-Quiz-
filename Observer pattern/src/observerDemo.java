
import java.util.ArrayList;
import java.util.List;


public class observerDemo {
    public static void main(String[] args) {
        Customer ahmad = new Customer("ahmad");
        Customer samer = new Customer("samer");
        Customer khalid = new Customer("khalid");
        Customer sami = new Customer("sami");

        StockPrice gold = new StockPrice();
        StockPrice teslaStock = new StockPrice();

        gold.attach(khalid);
        gold.attach(sami);



        teslaStock.attach(ahmad);
        teslaStock.attach(samer);
        teslaStock.attach(khalid);
        teslaStock.attach(sami);



        teslaStock.setMessage("the tesla stock is going down");

        System.out.println("  ");

        gold.setMessage("gold stock is going up");


    }
}



//- **Description**: Develop a stock price notifier application where users can subscribe to notifications for specific stock price changes. The observer pattern will help notify all subscribed users when the price of a stock changes.
//        - **Features**:
//        - Users can subscribe to notifications for specific stocks.
//        - Implement the observer pattern to update all subscribers when a stock price changes.
//    - Allow users to unsubscribe from notifications.