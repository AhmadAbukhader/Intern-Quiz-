
public class FoodOrder extends WorkFlow{
   private  String orderName ;
   private boolean reviewed ;
   private boolean hasCash ;
   private String payMethod ;
   private int orderPrice ;
   private Customer customer;

   public FoodOrder(){
       orderName = "no order";
       hasCash = false;
       orderPrice = 0;
       customer = new Customer();
       payMethod = "visa";

   }

   public FoodOrder(String orderName ,String payMethod , int orderPrice , Customer customer){
       this.orderPrice = orderPrice;
       this.orderName = orderName ;
       this.payMethod=payMethod;
       this.customer = customer;
   }


    @Override
    void validatingOrder() {
        if ((customer.getWallet() - orderPrice) >= 0){
            hasCash = true ;
        }
        System.out.println(customer.getName() + " ordered a " + orderName );
    }

    @Override
    void processingPayment() {
      if (hasCash) {
          reviewed= true ;
          System.out.println(customer.getName() + " is paying by : " + payMethod);
          customer.setWallet(customer.getWallet() - orderPrice );
      }else {
          reviewed = false ;
      }
    }
    @Override
    void preparingDelivery() {
      if (reviewed) {
       System.out.println("the order has been reviewed and will be delivered");
      }
    }
    @Override
    void sendingNotifications() {
     if (reviewed){
      System.out.println("your order is on the way ");
      System.out.println("thank you for waiting ");
     }else {
      System.out.println("you don`t have enough cash ");
     }
    }
}
