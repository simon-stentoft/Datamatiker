public class yyeye {
    public static void main(String[] args) {
        Ugedag iDag = Ugedag.ONSDAG;
        Ugedag iMorgen = Ugedag.TORSDAG;

        System.out.println(iDag);
        System.out.println(iMorgen);

    }
}
enum Ugedag {
    MANDAG, TIRSDAG, ONSDAG, TORSDAG, FREDAG, LØRDAG, SØNDAG
};