public class Lab9_1 {
    public static void main(String[] args) {
        Thread goodMorning = new Thread(new GoodMorning());
        Thread goodAfternoon = new Thread(new GoodAfternoon());
        goodMorning.start();
        goodAfternoon.start();
    }

    public static class GoodMorning implements Runnable {

        public void run() {
            while (true) {
                System.out.println("Good Morning!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }

    public static class GoodAfternoon implements Runnable {
        public void run() {
            while (true) {
                System.out.println("Good Afternoon!");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }
}