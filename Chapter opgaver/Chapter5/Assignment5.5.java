public class Ass5_5 {
    public static void main(String[] args) {

        System.out.println("Celsius\tFahrenheit\tFahrenheit\tCelsius");
        for (int i = 0; i <= 100; i+=2) {
            double fahrenheit = (i * 1.8) + 32;
            double fahrenTwo = 20 + 2.5*i;
            double celciusTwo = (fahrenTwo - 32)/1.8;
                System.out.println(String.format("%d\t\t\t %.1f | %.0f\t\t  %.2f", i, fahrenheit, fahrenTwo, celciusTwo));


        }
}
}
