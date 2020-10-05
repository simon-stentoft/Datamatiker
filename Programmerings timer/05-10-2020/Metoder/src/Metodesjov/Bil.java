package Metodesjov;

public class Bil {

    String bilNavn;
    int alder;

    public Bil(String bilNavn, int alder) {
        this.bilNavn = bilNavn;
        this.alder = alder;
    }

    public static int Biler() {
        Bil minBil = new Bil("Bugatti Veyron", 9);
        Bil minBil2 = new Bil("Ford Mondeo", 25);
        System.out.println("Bilen er en " + minBil.bilNavn + " og den er " + minBil.alder + " år gammel.");
        System.out.println("Bilen er en " + minBil2.bilNavn + " og den er " + minBil2.alder + " år gammel.");
        return minBil.alder;
    }
}
