public class Chapter_1_7 {
    public static void main(String[] args) {

        double pi = 4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13 - 1.0/15 + 1.0/17 - 1.0/19 + 1.0/21 - 1.0/23 + 1.0/25 - 1.0/27 + 1.0/29 - 1.0/31 + 1.0/33 - 1.0/35);

        double pi1 = 4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11);
        double pi2 = 4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13);
        double pi3 = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13);
        System.out.println(pi1);
        System.out.println(pi2);
        System.out.println(pi3);

        // Med 1.0 kommer der mange decimaler på  tallet, og uden .0 kommer der et helt tal 4.
    }
}
