package Chapter2;

import java.util.Scanner;

public class Opg5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();

        double gratuityTotal = subtotal*(gratuity/100);
        double total = gratuityTotal + subtotal;

        System.out.println("The gratuity is $"+ gratuityTotal + " and total is $" + total);


    }
}
