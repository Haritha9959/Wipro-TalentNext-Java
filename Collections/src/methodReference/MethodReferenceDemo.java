package methodReference;

public class MethodReferenceDemo {

    public static void main(String[] args) {

        PrimeCheck primeCheck = Prime::new;

        primeCheck.check(17);
        primeCheck.check(20);
        primeCheck.check(29);
        primeCheck.check(40);
    }
}