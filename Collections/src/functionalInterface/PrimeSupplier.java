package functionalInterface;

import java.util.ArrayList;
import java.util.function.Supplier;

public class PrimeSupplier {

    public static void main(String[] args) {

        Supplier<ArrayList<Integer>> supplier = () -> {

            ArrayList<Integer> primeNumbers = new ArrayList<>();

            int number = 2;

            while (primeNumbers.size() < 10) {

                boolean isPrime = true;

                for (int i = 2; i <= number / 2; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    primeNumbers.add(number);
                }

                number++;
            }

            return primeNumbers;
        };

        ArrayList<Integer> primes = supplier.get();

        System.out.println("First 10 Prime Numbers:");
        primes.forEach(System.out::println);
    }
}