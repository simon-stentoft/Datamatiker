package Chapter7;

public class Opg2 {

    public static void main(String[] args) {

        int[] numbers = {1,2,5,4,5,0,1,-2,9,8,1};

        for (int i = 0; i < 10; i++) {
            if (numbers[i] > numbers[10]) {
                System.out.printf("\n%s is greater than %s", numbers[i],numbers[10]);}
            else if (numbers[i] < numbers[10]) {
                System.out.printf("\n%s is smaller than %s",numbers[i],numbers[10]);}
            else {
                System.out.printf("\n%s is equal to %s",numbers[i],numbers[10]);
            }
        }
    }
}
