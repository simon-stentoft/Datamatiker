package Chapter9;

public class Opg4 {
    public static void main(String[] args) {

        java.util.Random randnumber = new java.util.Random(1000);

        for (int i = 1; i <= 50; i++) {
            System.out.printf("%3d", randnumber.nextInt(100));
        }
    }
}
