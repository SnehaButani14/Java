import java.util.Scanner;

public class lab3_5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        int length = inputString.length();
        int startIndex = length / 2;
        System.out.println("Second half of the string:");
        System.out.println(inputString.substring(startIndex));
    }
}
