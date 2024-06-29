import java.util.Scanner;
    class Circle{
        double radius;
        public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}
    public class lab5_1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double radius = sc.nextDouble();
        Circle c = new Circle();

        System.out.println(c.calculateArea(radius));
    }
}
 