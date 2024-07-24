



public class TemplatePattern extends FoodOrder {
    public static void main(String[] args) {
        FoodOrder burger = new FoodOrder("ahmad","fast food","visa",true);
        burger.template();
        FoodOrder pizza = new FoodOrder("ibrahim","pizza","cash",false);
        pizza.template();
    }
}





/*
Project Idea: E-commerce Order Processing and Notification System
Description: Develop a comprehensive system for an e-commerce platform that processes orders and
sends notifications to users at each step. Each type of order
(e.g., physical goods, digital goods, subscription services)
will follow a common order processing workflow
 (e.g., validating the order, processing the payment, preparing the delivery, sending notifications).
 The Template Pattern will define the skeleton of the order processing workflow,

Features:
Define a common template for the order processing workflow.
Implement specific order processors for different types of orders (e.g., physical goods, digital goods, subscription services).
Implement a notification system that updates users at each step of the order processing workflow
*/
