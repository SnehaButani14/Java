import java.util.Scanner;

public class lab5_3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] totalCounts = new int[5]; // Index 0: 'a', Index 1: 'e', Index 2: 'i', Index 3: 'o', Index 4: 'u'

        while (true) {
            System.out.print("Enter a sentence (type 'quit' to exit): ");
            String sentence = scanner.nextLine().toLowerCase();
            if (sentence.equals("quit")) {
                break;
            }

            int[] counts = countVowels(sentence);
            displayCounts(counts);

            for (int i = 0; i < 5; i++) {
                totalCounts[i] += counts[i];
            }
        }

        System.out.println("Total counts for all sentences:");
        displayCounts(totalCounts);

        scanner.close();
    }

    public static int[] countVowels(String sentence) {
        int[] counts = new int[5]; // Index 0: 'a', Index 1: 'e', Index 2: 'i', Index 3: 'o', Index 4: 'u'
        for (char c : sentence.toCharArray()) {
            switch (c) {
                case 'a':
                    counts[0]++;
                    break;
                case 'e':
                    counts[1]++;
                    break;
                    
                case 'i':
                    counts[2]++;
                    break;
                case 'o':
                    counts[3]++;
                    break;
                case 'u':
                    counts[4]++;
                    break;
            }
        }
        return counts;
    }

    public static void displayCounts(int[] counts) {
        System.out.println("Counts:");
        System.out.println("a: " + counts[0]);
        System.out.println("e: " + counts[1]);
        System.out.println("i: " + counts[2]);
        System.out.println("o: " + counts[3]);
        System.out.println("u: " + counts[4]);
    }
}
