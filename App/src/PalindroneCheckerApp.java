import java.util.Scanner;
public class PalindroneCheckerApp{
    public static boolean isPalindrone(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        // Compare characters from both ends
        while (left < right) {
            if (chars[left] != chars[right]) {
                return false; // mismatch found
            }
            left++;
            right--;
        }
        return true; // all matched
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