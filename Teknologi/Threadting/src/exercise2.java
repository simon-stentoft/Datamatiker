import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            Thread thread = new Thread();
            System.out.println("Hej, dette er thread " + i + ".");
        }
    }
}
