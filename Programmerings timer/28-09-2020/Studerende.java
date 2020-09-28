import java.util.Scanner;
public class Studerende {

    String navn;
    int alder;
    String by;
    String studieretning;
    String campus;

    Studerende() {
        System.out.println("Et nyt objekt er instansieret af typen Studerende");
        studieretning = "Datamatiker";
        campus = "Næstved";
    }

    Studerende(String x, int y, String z) {
        this.navn = x;
        this.alder = y;
        this.by = z;
    }

    class Pet {

        String navn;

    }
}
