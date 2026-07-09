package newFeature;

public class LambdaDemo {

    public static void main(String[] args) {

        // Lambda expression for addition
        Test t1 = (a, b, c) -> a + b + c;

        // Lambda expression for multiplication
        Test t2 = (a, b, c) -> a * b * c;

        System.out.println("Addition = " + t1.myFunction(10, 20, 30));
        System.out.println("Multiplication = " + t2.myFunction(10, 20, 30));
    }
}