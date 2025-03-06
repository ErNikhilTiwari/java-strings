import java.util.Scanner;

public class ToggleCase {
    public static String toggleCase(String str) {
        StringBuilder toggled = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) toggled.append(Character.toLowerCase(ch));
            else if (Character.isLowerCase(ch)) toggled.append(Character.toUpperCase(ch));
            else toggled.append(ch);
        }
        return toggled.toString();
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Toggled String: " + toggleCase(str));
    }
}
