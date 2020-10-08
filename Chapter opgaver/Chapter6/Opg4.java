package Chapter6;

import java.util.Scanner;

public class Opg4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int userInput = input.nextInt();

       reverse(userInput);

    }
    public static void reverse(int number) {
        while (number != 0) {
            System.out.println(number % 10);
            number /= 10;
        }
    }
}
