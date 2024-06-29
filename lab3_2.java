import java.util.Scanner;

public class lab3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = sc.nextLine();
        int c = 0;
        int v = 0;
        for (int i = 0; i < a.length(); i++) {
            char ch = Character.toLowerCase(a.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                v++;
            } else if (Character.isLetter(ch)) {
                c++;
            }
        }
        System.out.println("Consonants: " + c);
        System.out.println("Vowels: " + v);
    }
}
