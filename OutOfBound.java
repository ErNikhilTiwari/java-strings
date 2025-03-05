import java.util.Scanner;

public class OutOfBound {
    
    // Method to generate the exception
    public static void generateException(String str) {
        // Accessing index beyond the string length
        System.out.println("Character at position 100: " + str.charAt(100));
    }
    
    // Method to handle the exception using try-catch block
    public static void handleException(String str) {
        try {
            System.out.println("Character at position 100: " + str.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Index out of bounds. " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        

        try {
            generateException(inputString);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Index out of bounds. " + e.getMessage());
        }

        
        // Calling the method to handle the exception
        handleException(inputString);
        
        scanner.close();
    }
}
