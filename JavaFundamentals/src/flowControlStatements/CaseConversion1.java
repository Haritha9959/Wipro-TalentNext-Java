package flowControlStatements;

public class CaseConversion1 {

    public static void main(String[] args) {

        char ch = 'a';   // Initialize the character

        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + "->" + Character.toUpperCase(ch));
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + "->" + Character.toLowerCase(ch));
        } else {
            System.out.println("Invalid Input");
        }
    }
}