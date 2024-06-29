import java.util.Scanner;
class Vowels{
    char a;
    int count;
    public void getVowels(){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
    public void countVowels() {
        count = 0;
        for (int i = 0; i < a.length(); i++) {
            char ch = Character.toLowerCase(a.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
    }
    public void printCount(){
        System.out.println(count);
    } 
}

public class lab5_5{
    public static void main(String[] args){
        Vowels v1 = new Vowels();
        v1.getVowels();
        v1.countVowels();
        v1.printVowels();
    }
}