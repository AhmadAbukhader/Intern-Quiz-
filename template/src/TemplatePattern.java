



public class TemplatePattern extends FoodOrder {
    public static void main(String[] args) {
        Customer customer = new Customer("ahmad" , 200);
        Clothes jacket = new Clothes("Red Jacket" ,"visa",200 , customer );
        jacket.template();

        System.out.println("  ");

        FoodOrder burger = new FoodOrder("pizza","visa",100 , customer );
        burger.template();


    }
}

/*

Project Idea: E-commerce Order Processing and Notification System
Description: Develop a comprehensive system for an e-commerce platform that processes orders and
sends notifications to users at each step. Each type of order
will follow a common order processing workflow
 (e.g., validating the order, processing the payment, preparing the delivery, sending notifications).
 The Template Pattern will define the skeleton of the order processing workflow,

*/
