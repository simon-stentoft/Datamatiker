public class test {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (number < 20) {
            number++;
            sum += number;
            if (sum >= 100) break;
            System.out.println("Ved nummer " +number+" er summen mindre end 100");

        }
        System.out.println("Nummer er " + number);
        System.out.println("Sum er " + sum);
    }
}
// Programmet tager nummer, og plusser nummeret ind i sum hvergang loopet kører.
// Loop kører indtil sum er = 100, den vil da printe nummeret loopet stoppede på og summen.
