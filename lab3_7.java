import java.util.Scanner;
public class lab3_7{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        for(int i=0;i<a.length();i++){
                System.out.println(a.substring(0,i+1));
        }
    }
}