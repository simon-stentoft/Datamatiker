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

        switch (month) {
            case 1:
                System.out.println("January " + year + " has " + daysInMonth + " days.");
                break;
            case 2:
                System.out.println("February " + year + " has " + daysInMonth + " days.");
                break;
            case 3:
                System.out.println("March " + year + " has " + daysInMonth + " days.");
                break;
            case 4:
                System.out.println("April " + year + " has " + daysInMonth + " days.");
                break;
            case 5:
                System.out.println("May " + year + " has " + daysInMonth + " days.");
                break;
            case 6:
                System.out.println("June " + year + " has " + daysInMonth + " days.");
                break;
            case 7:
                System.out.println("July " + year + " has " + daysInMonth + " days.");
                break;
            case 8:
                System.out.println("August " + year + " has " + daysInMonth + " days.");
                break;
            case 9:
                System.out.println("September " + year + " has " + daysInMonth + " days.");
                break;
            case 10:
                System.out.println("October " + year + " has " + daysInMonth + " days.");
                break;
            case 11:
                System.out.println("November " + year + " has " + daysInMonth + " days.");
                break;
            case 12:
                System.out.println("December " + year + " has " + daysInMonth + " days.");
                break;
        }
      /*
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
*/

    }
}
