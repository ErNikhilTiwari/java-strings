import java.util.Scanner;

public class ReturnChar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.next();

        char[] userDefinedChars = getCharsFromString(input);
        char[] builtInChars = input.toCharArray();

        boolean areEqual = compareCharArrays(userDefinedChars, builtInChars);

        System.out.println("User-defined method result: ");
        for (char c : userDefinedChars) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Built-in method result: ");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Are both arrays equal? " + areEqual);
    }

    public static char[] getCharsFromString(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
