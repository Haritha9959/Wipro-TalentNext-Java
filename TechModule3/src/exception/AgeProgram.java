package exception;

public class AgeProgram {

    public static void main(String[] args) {

        try {

            if (args.length != 2) {
                throw new AE("Please enter Name and Age as command line arguments.");
            }

            String name = args[0];
            int age = Integer.parseInt(args[1]);

            if (age < 18 || age >= 60) {
                throw new AE("Age should be greater than or equal to 18 and less than 60.");
            }

            System.out.println("Name : " + name);
            System.out.println("Age : " + age);
            System.out.println("Valid Age");

        } catch (NumberFormatException e) {
            System.out.println("Age should be an integer.");
        } catch (AE e) {
            System.out.println(e.getMessage());
        }
    }
}