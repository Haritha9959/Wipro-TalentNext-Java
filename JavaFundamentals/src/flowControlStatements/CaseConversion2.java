package flowControlStatements;

public class CaseConversion2 {

    public static void main(String[] args) {

        char ch = 'A';   // Change the value to test

        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + "->" + Character.toUpperCase(ch));
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + "->" + Character.toLowerCase(ch));
        } else {
            System.out.println("Invalid Input");
        }
    }
}