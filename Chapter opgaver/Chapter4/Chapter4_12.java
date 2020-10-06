package Chapter4;

import java.util.Scanner;

public class Chapter4_12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex digit: ");
        String hexdigit = input.next();

        if (hexdigit.length() != 1) {
            System.out.println("Only enter one character");
            System.exit(1);

        }

        switch (hexdigit.toLowerCase()) {
            case "0", "1", "2", "3","4","5","6","7","8","9" -> System.out.printf("\nThe binary value is %s", Integer.toBinaryString(Integer.parseInt(hexdigit)));
            case "a", "b", "c", "d","e","f" -> {
                switch (hexdigit.toLowerCase()) {
                    case "a" -> System.out.printf("\nThe binary value is %s", Integer.toBinaryString(10));
                    case "b" -> System.out.printf("\nThe binary value is %s", Integer.toBinaryString(11));
                    case "c" -> System.out.printf("\nThe binary value is %s", Integer.toBinaryString(12));
                    case "d" -> System.out.printf("\nThe binary value is %s", Integer.toBinaryString(13));
                    case "e" -> System.out.printf("\nThe binary value is %s", Integer.toBinaryString(14));
                    case "f" -> System.out.printf("\nThe binary value is %s", Integer.toBinaryString(15));

                }
            }
        }
    }
}
// Hjælp fra Lasse : - )

