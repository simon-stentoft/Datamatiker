package Chapter4;

import java.util.Scanner;

public class Chapter4_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter binary digits (0000 to 1111): ");
        int binaryDigits = input.nextInt();

        int num1 = (binaryDigits / 1000) * 8;
        int num2 = ((binaryDigits / 100) % 10) * 4;
        int num3 = ((binaryDigits / 10) % 10) * 2;
        int num4 = ((binaryDigits / 10) % 10) * 1;

        int decimalNumber = num1 + num2 + num3 + num4;
        System.out.printf("The decimal value is %d", decimalNumber);

    }
}
