public class PalindroneCheckerApp {
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();

        String reversedStr = new StringBuilder(str).reverse().toString();

        return str.equals(reversedStr);
    }
    public static void main(String[] args) {
        String[] testStrings = {
                "madam",
                "racecar",
                "hello",
                "A man a plan a canal Panama"
        };
        for (String word : testStrings) {
            if (isPalindrome(word)) {
                System.out.println("'" + word + "' is a palindrome.");
            } else {
                System.out.println("'" + word + "' is not a palindrome.");
            }
        }
    }
}