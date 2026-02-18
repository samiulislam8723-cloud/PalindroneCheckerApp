import java.util.Stack;
import java.util.Scanner;

public class PalindroneCheckerApp {

    // Method to check if a string is palindrome using stack
    public static boolean isPalindrone(String str) {
        Stack<Character> stack = new Stack<>();

        // Push all characters onto the stack
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        // Build reversed string by popping from stack
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        // Compare original and reversed
        return str.equals(reversed.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (input == null || input.isEmpty()) {
            System.out.println("Invalid input. Please enter a non-empty string.");
        } else {
            if (isPalindrone(input)) {
                System.out.println("The string \"" + input + "\" is a palindrome.");
            } else {
                System.out.println("The string \"" + input + "\" is NOT a palindrome.");
            }
        }

        scanner.close();
    }
}