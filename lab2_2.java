import java.util.Scanner;

public class lab2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number or string: ");
        String input = scanner.nextLine();
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
    private static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s", "").toLowerCase();
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
