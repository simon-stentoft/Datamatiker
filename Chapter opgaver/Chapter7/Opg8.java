package Chapter7;

import java.util.Scanner;

public class Opg8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.println(average(numbers));
    }
    public static int average(int[] array) {
        int average = 0;
        int sum;
        for (int i = 0; i < array.length; i++) {
            sum =+ array[i];
            average = sum / array.length;
        }
        return average;
    }

    public static double average(double[] array) {
        double average = 0;
        double sum;
        for (int i = 0; i < array.length; i++) {
            sum =+ array[i];
            average = sum / array.length;
        }
        return average;
    }
}
