import java.util.Scanner;

public class lab1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();  
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("area=" +area);
    }
}
