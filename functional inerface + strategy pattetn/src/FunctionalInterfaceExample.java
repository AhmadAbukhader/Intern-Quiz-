

import java.util.function.UnaryOperator;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = num -> {
         System.out.println("from the unary operator");
         return num * num ;
        };
        int result = square.apply(5); // 25
        System.out.println(result);
    }
}
