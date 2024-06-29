public class lab3_3 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40};
        int arraySum = 0;
        for (int i = 0; i < array.length; i++) {
            arraySum += array[i];
        }
        double average = (double) arraySum / array.length;
        System.out.println("The average of the values in the array is: " + average);
    }
}
