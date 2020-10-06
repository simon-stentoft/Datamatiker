public class Chapter_1_4 {
    public static void main(String[] args) {

        //Table som en string og sætter en grænse på 5 rækker.
        String[][] table = new String[5][];
        table[0] = new String[] {"a",   "a^2",  "a^3",  "a^4"};
        table[1] = new String[] {"1",   "1",  "1",  "1"};
        table[2] = new String[] {"2",   "4",  "8",  "16"};
        table[3] = new String[] {"3",   "9",  "27",  "81"};
        table[4] = new String[] {"4",   "16",  "64",  "256"};

        //%15s fortæller hvor linjen skal være.
        for (String[] row: table) {
            System.out.format("%15s%15s%15s%15s\n", row);
        }
    }
}
