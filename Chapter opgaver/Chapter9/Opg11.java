import java.util.Scanner;

public class Opg11 {
    public static void main(String[] args) {

        LinearEquation Equation1 = new LinearEquation(1,3,4,6,10,1.4);

        if (Equation1.isSolvable())
            System.out.println("x is " + Equation1.getX() + " and y is " + Equation1.getY() + ".");
        else
            System.out.println("The equation has no solution.");
    }
}
class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    LinearEquation(double a, double b, double c, double d, double e, double f) { //Constructor
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;

    }//Accessor methods/getter methods
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getD() {
        return d;
    }
    public double getE() {
        return e;
    }
    public double getF() {
        return f;
    }
    boolean isSolvable() {
        return a*d - b*c != 0;
    }
    public double getX() {
        return (e*d - b*f) / (a*d - b*c);
    }
    public double getY() {
        return (a*f - e*c) / (a*d - b*c);
    }
}
