package Chapter2;

import java.util.Scanner;

public class Opg11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int currentPopulation = 312032386;

        System.out.print("Enter the number of years: ");
        int x = input.nextInt();


        //danner et for loop som kører formerings loop igen op til 5 år
        {
            for (int i = 1; i <= (365 * 24 * 60 * 60); i++)
            //danner grunlag for den sekund pøl som modulus kan tage af
            {
                if (i % 7 == 0) {
                    currentPopulation += 1;
                    // regner formering
                }
                if (i % 13 == 0) {
                    currentPopulation -= 1;
                    // regner afdøde
                }
                if (i % 45 == 0) {
                    currentPopulation += 1;
                    // regner indvandring
                }

            }
            System.out.println("The population in " + x + " years is " + currentPopulation);
        }
    }
}
