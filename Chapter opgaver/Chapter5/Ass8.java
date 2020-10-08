package Chapter5Assignments;

import java.util.Scanner;

public class Ass8 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("How many students are there?: ");
        int studentsNumber = inp.nextInt();

        int highestScore = 0;   //Saving the highest score in this variable
        String highestScoreName = "";  //Saving name of student with highest score

        for (int i = 1; i <= studentsNumber; i++) {    //Loop starting at 1 running until and also counting the number in the studentsNumber variable, is reached
            System.out.print("Enter student name: ");
            String studentName = inp.next();
            System.out.print("Enter student score: ");
            int studentScore = inp.nextInt();
            if (i != studentsNumber)
                System.out.println("Next student");
            if (studentScore > highestScore)
                highestScore = studentScore;
                highestScoreName = studentName;
        }
        System.out.println("Student with highest score is " + highestScoreName);  //Printing name of student with highest score.
    }
}
