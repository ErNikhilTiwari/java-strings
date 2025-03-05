public class NullPointer {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;
        // This will throw NullPointerException
        System.out.println(text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {
        
            System.out.println("Caught NullPointerException: " + e.getMessage());
    
    }

    public static void main(String[] args) {
        // Call the method to generate the exception
        try {
            generateException();
        } catch (NullPointerException e) {
             // Call the method to handle the exception
             handleException();
        }

       
        
    }
}
