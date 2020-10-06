package Chapter2;

import java.util.Scanner;

public class Opg2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of the sides and height of the Equilateral triangle: ");
        double length = input.nextDouble();

        double area = (Math.sqrt(3) / 4) * (length*length);
        double volume = area * length;

        System.out.println("The area is " + area);
        System.out.println("The volume of the Triangular prism is " + volume);


    }
}
