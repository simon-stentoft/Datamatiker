package Chapter6;

import java.util.Scanner;

public class Opg20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String e = input.nextLine();

        System.out.println("Number of letters in the string is: " + countLetters(e));
    }
    public static int countLetters(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)))  //Checking if the element on index 'i' in my string is a letter, if it is then count++;
                count++;
        }
        return count;
    }
}
