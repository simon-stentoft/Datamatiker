package Chapter6;

import java.util.Scanner;

public class Opg23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.println("Number of occurrences: " + count(s,'e'));
    }
    public static int count(String str, char a) {
        int number = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a)
                number++;
        }
        return number;
    }
}
