package Chapter6;

import java.util.Scanner;

public class Opg2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long userInput = input.nextInt();

        System.out.println("Sum of the digits " + userInput + " is " + sumDigits(userInput));

    }
    public static int sumDigits(long n) {
        int result = 0;

        while (n > 0) {

            result += n % 10;
            n /= 10;
        }
return result;


    }
}
