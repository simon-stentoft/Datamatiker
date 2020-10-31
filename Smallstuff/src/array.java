public class array {
    public static void main(String[] args) {
        int x = 413;
        int[] y = new int[40];

        f(x,y);
        System.out.println(x);
        System.out.println(y[33]);
    }
    public static void f(int number, int[] numbers) {
        number = 1231;
        numbers[33] = 31244;
    }
}
