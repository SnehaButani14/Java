public class Time {
    private int hour;
    private int minute;

    
    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public Time addTime(Time t) {
        int newHour = this.hour + t.hour;
        int newMinute = this.minute + t.minute;
    
        if (newMinute >= 60) {
            newHour += newMinute / 60;
            newMinute %= 60;
        }
        
        newHour %= 24; 
        
        return new Time(newHour, newMinute);
    }

    public static void main(String[] args) {
        
        Time time1 = new Time(10, 30);
        Time time2 = new Time(3, 45);
        Time sum = time1.addTime(time2);

        System.out.println("Time 1: " + time1.hour + ":" + time1.minute);
        System.out.println("Time 2: " + time2.hour + ":" + time2.minute);
        System.out.println("Sum: " + sum.hour + ":" + sum.minute);
    }
}
