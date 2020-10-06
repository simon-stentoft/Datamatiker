public class Chapter_1_11 {
    public static void main(String[] args) {

        // Population før loop. Integer pga. det et helt tal.
        int Currentpopulation = 312032486;

        // Loop 5 gange for 5 år.
        for (int x = 1; x <=5; x++) {
            for (int i =1; i <=(365*24*60*60); i++) {
                if (i% 7 == 0) {
                    Currentpopulation += 1;
                }
                if (i % 13 == 0) {
                    Currentpopulation -= 1;
                }
                if (i% 45 == 0) {
                    Currentpopulation += 1;
                }
            }
            System.out.println("Ny population " + x + " år efter begyndelses år: " + Currentpopulation);
        }

    }
}
