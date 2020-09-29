package Chapter3;
import java.util.Scanner;
public class Opg3_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 10 % 10);
        int number3 = (int)(System.currentTimeMillis() % 10 * 2);

        System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");

        int answer = input.nextInt();

        System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " + (number1 + number2 + number3 == answer));
    }
}
