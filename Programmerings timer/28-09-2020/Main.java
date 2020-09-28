import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Studerende st1 = new Studerende();
        st1.navn = "Lasse";
        st1.alder = 22;
        st1.by = "Skuderløse";

        Studerende st2 = new Studerende();
        st2.navn = "Asta";
        st2.alder = 22;
        st2.by = "Haslev";

        Studerende st3 = new Studerende("Delal");

        Studerende st4 = new Studerende();
        st4.navn = "Fredrik";
        st4.alder = 24;
        st4.by = "Nykøbing Falster";

        Studerende st5 = new Studerende();
        st5.navn = "Simon";
        st5.alder = 24;
        st5.by = "Faxe";

        System.out.println("De studerende er oprettet");

        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Hvem vil du slå op i databasen? ");
            String nameToFind = scanner.next();
            switch (nameToFind) {
                case "Lasse":
                    System.out.println(st1.alder + st1.by);
                    break;
                case "Asta":
                    System.out.println(st2.alder);
                    break;
                case "Delal":
                    System.out.println(st3.alder);
                    break;
                case "Fredrik":
                    System.out.println(st4.alder);
                    break;
                case "Simon":
                    System.out.println(st4.alder);
                    break;
                default:
                    System.out.println("Personen er ikke studerende.");

            }
        }
    }
}
