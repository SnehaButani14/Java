public class OddEvenPrinter {
    private static final int MAX = 20;
    private int number = 1; 
    private final Object lock = new Object();

    public static void main(String[] args) {
        OddEvenPrinter printer = new OddEvenPrinter();
        Thread t1 = new Thread(printer.new OddThread(), "OddThread");
        Thread t2 = new Thread(printer.new EvenThread(), "EvenThread");
        
        t1.start();
        t2.start();
    }

    private class OddThread implements Runnable {
        @Override
        public void run() {
            while (number < MAX) {
                synchronized (lock) {
                    if ((number % 2) != 0) { 
                        System.out.println(Thread.currentThread().getName() + ": " + number);
                        number++;
                        lock.notify(); 
                    } else {
                        try {
                            lock.wait(); 
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            System.out.println("Thread interrupted " + e.getMessage());
                        }
                    }
                }
            }
        }
    }

    private class EvenThread implements Runnable {
        @Override
        public void run() {
            while (number <= MAX) {
                synchronized (lock) {
                    if ((number % 2) == 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + number);
                        number++;
                        lock.notify(); 
                    } else {
                        try {
                            lock.wait(); 
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            System.out.println("Thread interrupted " + e.getMessage());
                        }
                    }
                }
            }
        }
    }
}
