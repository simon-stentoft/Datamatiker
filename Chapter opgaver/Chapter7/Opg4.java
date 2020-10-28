package Chapter7;

import java.util.Scanner;

public class Opg4 {
    public static void main(String[] args) {
        Score();
    }
    public static void Score() {
        Scanner input = new Scanner(System.in);

        int[] scores = new int[100];
        int number = 0;
        int numberOfScores = 0;
        int scoresTotal = 0;

        for (int i = 0; i < 100; i++) {
            System.out.print("Enter score, a negative score means the end of the loop: ");
            number = input.nextInt();
            if (number < 0)
                break;

            scores[i] = number;
            numberOfScores = i + 1;
            scoresTotal += number;
        }
        double scoreAverage = scoresTotal / numberOfScores;
        int belowAverage = 0;
        int aboveAverage = 0;
        int equalToAverage = 0;

        for (int i = 0; i < numberOfScores; i++) {
            if (scores[i] > scoreAverage)
                aboveAverage++;
            else if (scores[i] < scoreAverage)
                belowAverage++;
            else
                equalToAverage++;
        }
        System.out.printf("Total score is: %s \nAverage score is: %s \nScores below average: %s \nScores above average: %s \nScores equal to average: %s",scoresTotal,scoreAverage,belowAverage,aboveAverage,equalToAverage);
    }
}