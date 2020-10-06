package Chapter2;

import java.util.Scanner;

public class Opg7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int min = input.nextInt();

        int days = min/60/24;
        int years = days/365;
        int x = min - (years*365*24*60);
        int daysDisplayed = x / (24*60);

        System.out.println(min + " minutes is approximately " + years + " years and " + daysDisplayed + " days");


    }
}
