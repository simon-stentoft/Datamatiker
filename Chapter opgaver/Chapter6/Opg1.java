package Chapter6;

public class Opg1 {
    public static void main(String[] args) {
        int pentagonal = 100;
        int lines = 10;

        for (int i = 1; i <= pentagonal; i++) {
            if (i % lines == 0)
                System.out.printf("%7d\n",getPentagonalNumber(i));
            else System.out.printf("%7d",getPentagonalNumber(i));
            }

        }
    public static int getPentagonalNumber(int n) {
        return (n*(3*n-1))/2;

    }
}
// Help from https://github.com/jsquared21/Intro-to-Java-Programming/blob/master/Exercise_06/Exercise_06_01/Exercise_06_01.java