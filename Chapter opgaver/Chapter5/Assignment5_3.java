package Chapter5Assignments;

public class Assignment5_3 {
    public static void main(String[] args) {


        System.out.println("Celsius        Fahrenheit");
        for (double celsius = 0; celsius <= 100; celsius++) {
            final double fahrenheit = (celsius * 9/5) + 32;
            if (celsius % 2 == 0) {
                System.out.println(celsius+"            "+ fahrenheit);

            }
        }
    }
}