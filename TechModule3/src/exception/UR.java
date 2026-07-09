package exception;

public class UR {

    void registerUser(String username, String userCountry) throws ICE {

        if (!userCountry.equalsIgnoreCase("India")) {
            throw new ICE("User Outside India cannot be registered");
        } else {
            System.out.println("User registration done successfully");
        }
    }

    public static void main(String[] args) {

        UR obj = new UR();

        // Example 1
        try {
            obj.registerUser("Mickey", "US");
        } catch (ICE e) {
            System.out.println(e.getMessage());
        }

        // Example 2
        try {
            obj.registerUser("Mini", "India");
        } catch (ICE e) {
            System.out.println(e.getMessage());
        }
    }
}