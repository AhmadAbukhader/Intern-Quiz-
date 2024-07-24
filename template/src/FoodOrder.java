public class FoodOrder extends WorkFlow{
   private final String name ;
   private String type ;
   private boolean reviewed ;
   private boolean hasCash ;
   private String payMethod ;

   public FoodOrder(){
       name = "ahmad" ;
   }

   public FoodOrder(String name, String type ,String payMethod , boolean hasCash){
       this.name=name;
       this.type = type;
       this.payMethod=payMethod;
       this.hasCash=hasCash;
   }

    @Override
    void validatingOrder() {
        System.out.println(name + " ordered a " + type );
    }

    @Override
    void processingPayment() {
      if (hasCash) {
          reviewed= true ;
          System.out.println(name + " is paying by : " + payMethod);
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
