package Chapter2;

import java.util.Scanner;
public class Opg1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter miles: ");
        double mile = input.nextDouble();

        double km = mile*1.6;

        System.out.println(mile + " miles is " + km + " kilometers");
    }
}
