import java.util.Scanner;

class Time {
    int h;
    int m;
    public Time(int hours, int minutes) {
        this.h = hours;
        this.m = minutes;
    }
    public void add(Time t1, Time t2) {
        this.h = t1.h + t2.h;
        this.m = t1.m + t2.m;
        this.h += this.m / 60;
        this.m %= 60;
    }
}

public class lab5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Time t1 = new Time(2, 50);
        Time t2 = new Time(5,30);
        Time t3 = new Time(0,0);
        t3.add(t1, t2);
        System.out.println(t3.h + ":" + t3.m);
    }
}
