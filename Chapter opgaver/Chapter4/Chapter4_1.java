package Chapter4;
import java.util.Scanner;
public class Chapter4_1 {
    public static void main(String[] args) {
        System.out.print("Enter the length from the center to a vertex: ");
        Scanner input = new Scanner(System.in);

        double r = input.nextDouble();
        double s = 2*r*Math.sin(Math.PI/5);
        double area = (5 * Math.pow(s,2))/(4*Math.tan(Math.PI/5)) ;

        System.out.println(String.format("The area of the pentagon is %.2f", area));
    }
}
