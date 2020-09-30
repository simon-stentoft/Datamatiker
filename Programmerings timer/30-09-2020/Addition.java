import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = (int)(Math.random() *10);
        int num2 = (int)(Math.random() *10);

        System.out.print("What is " + num1 + " + " + num2 + "? ");
        int answer = input.nextInt();

        while (num1 + num2 != answer) {
            System.out.println("Wrong answer, try again.");
            answer = input.nextInt();

        }
        System.out.println("You got it right.");
    }
}
