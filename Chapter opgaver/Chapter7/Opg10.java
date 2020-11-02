package Chapter7;

import java.util.Scanner;

public class Opg10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        } //(indexOfLargestElement(numbers) - 1) Viser indexet i numbers array. numbers[indexOfLargestElement(numbers)] viser tallet i det forrige index.
        System.out.println("Index: [" + (indexOfLargestElement(numbers) - 1) + "] " + "Element: " + numbers[indexOfLargestElement(numbers)]);
    }
    public static int indexOfLargestElement(double[] array) {
        int index = 0;
        double elementInIndex = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > elementInIndex) {
                elementInIndex = array[i];
                index = i;
            }
        }
return index;
    }
}
