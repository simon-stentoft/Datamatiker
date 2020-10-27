import java.util.Random;

public class Farvearray {

    public static void AssWithStrings() {
        Random random = new Random();
        final String[] colorNames = {"Blå", "Rød", "Lilla", "Hvid", "Sort", "Grå", "Lyserød", "Pink", "Mørke blå"};
        final int numberofColors = 3;
        final int index = random.nextInt(colorNames.length);
        final String colorToCheck = "Rød";

        String[] colors = new String[numberofColors];
        colors[0] = colorNames[0];
        colors[1] = colorNames[1];
        colors[2] = colorNames[4];

        for (String currentColor : colors) {
            if (currentColor.equals(colorToCheck)) {
                System.out.printf("Farven %s findes i arrayet. \n", colorToCheck);
            }
            else
                System.out.println("colortoCheck findes ikke i arrayet");
            }
        }

    public static void main(String[] args) {
        AssWithStrings();

    }
}
