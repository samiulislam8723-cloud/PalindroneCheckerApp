
import java.util.Scanner;

public class PalindroneCheckerApp {
    public static boolean isPalindrone(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end))
                return false;

            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        long startTime = System.nanoTime();

        boolean result = isPalindrone(input);

        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + result);
        System.out.println("Execution Time: " + executionTime + " ns");

        sc.close();
    }
}