



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
