import java.util.Scanner;
public class AreaOfCircle{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius : ");
        double radius = sc.nextDouble();
        double ans = Math.PI*radius*radius;
        System.out.println(ans);
    }
}