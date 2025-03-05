import java.util.Scanner;

public class SubStr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the string: ");
        String inputString = scanner.next();
        System.out.print("Enter the start index: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter the end index: ");
        int endIndex = scanner.nextInt();

        // Create substring using charAt() method
        String substringUsingCharAt = createSubstringUsingCharAt(inputString, startIndex, endIndex);

        // Create substring using built-in substring() method
        String substringUsingBuiltIn = inputString.substring(startIndex, endIndex);

        // Compare the two substrings
        boolean areEqual = compareStrings(substringUsingCharAt, substringUsingBuiltIn);

        // Display the results
        System.out.println("Substring using charAt(): " + substringUsingCharAt);
        System.out.println("Substring using built-in substring(): " + substringUsingBuiltIn);
        System.out.println("Are the substrings equal? " + areEqual);
    }

    public static String createSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}