import java.time.YearMonth;
import java.util.Scanner;

public class Opg11 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Enter month as number 1-12: ");
        int month = i.nextInt();
        System.out.print("Enter year: ");
        int year = i.nextInt();

        YearMonth YM = YearMonth.of(year,month);
        int daysInMonth = YM.lengthOfMonth();

        String printMonth;
        if (month == 1)
            printMonth = "January";
        else if (month == 2)
            printMonth = "February";
        else if (month == 3)
            printMonth = "March";
        else if (month == 4)
            printMonth = "April";
        else if (month == 5)
            printMonth = "May";
        else if (month == 6)
            printMonth = "June";
        else if (month == 7)
            printMonth = "July";
        else if (month == 8)
            printMonth = "August";
        else if (month == 9)
            printMonth = "September";
        else if (month == 10)
            printMonth = "October";
        else if (month == 11)
            printMonth = "November";
        else
            printMonth = "December";

        System.out.println(printMonth + " " + year + " has " + daysInMonth + " days.");
    }
}
