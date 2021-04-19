public class Rekursiv {
    public static void main(String[] args) {
        //infiniteRecursive();
        //recursiveNumber(1);
        recursiveFakultet(5);
    }

    private static void infiniteRecursive() {
        System.out.println("Kører uendeligt. (Maybe)");
        infiniteRecursive();
    }
    private static void recursiveNumber(int x) {
        if (x==10) {return;} //Base case stop case
        System.out.println("Hej " + x);
        recursiveNumber(x += 1);
    }
    private static long recursiveFakultet(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
