package Chapter4;

import java.util.Scanner;

public class Chapter4_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char i = input.next().charAt(0);
        System.out.println("The Unicode value of " + i + " is: " + (int) i);
    }
}
