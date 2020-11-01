package Chapter7;

import java.util.Scanner;

public class Opg9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.print("The maximum number is: " + max(numbers));
    }
    public static double max(double[] array) {
        double max = array[0];
        for (double i: array) {
            if (i > max) {
                max = i;
            }
        }
return max;
    }
}


