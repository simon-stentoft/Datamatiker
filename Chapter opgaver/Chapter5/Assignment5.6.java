import java.util.Scanner;
public class Ass5_6 {
    public static void main(String[] args) {

        System.out.println("Ping\t\tSquare meter\t\tSquare meter\t\tPing");
        for (int i = 10; i <= 80; i+=5) {
            double squareMeter = i*3.305;
            double squareMeters2 = 20 + i;
            double ping = squareMeters2/3.305;
            System.out.println(String.format("%d\t\t\t%.3f \t\t\t| \t\t\t%.0f\t\t\t%.3f", i, squareMeter, squareMeters2, ping));
        }
    }
}
