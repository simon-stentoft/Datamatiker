package Chapter2;
import java.util.Scanner;
public class Opg4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in square meters: ");
        double squaremeter = input.nextDouble();

        double ping = squaremeter*0.3025;

        System.out.println(squaremeter + " square meters is " + ping + " pings");
    }
}
