import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>(); //Skriv <String> for string eller: Integer, Double, Character for char, Boolean.
        cars.add("Blå");
        cars.add("Sort");
        cars.add("Grå");
        cars.add("Rød");

        System.out.println(cars);

        System.out.println(cars.get(0));
        System.out.println(cars.get(1));

        cars.set(0, "Lilla");
        System.out.println(cars.get(0));
        System.out.println(cars);

        cars.remove(2);
        System.out.println(cars);
        System.out.println(cars.toArray().length);
        cars.add(3,"Hvid");
        System.out.println(cars.toArray().length);
        System.out.println(cars);
        System.out.println(cars.size()); //Use cars.size instead of cars.toArray().length) to print size of array.

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        for (String i: cars) {  //for each loop. String index i, I cars, print element i index 0, hvid.
            System.out.println(i);
        }
        cars.add("Gul");
        System.out.println(cars);

        ArrayList<Boolean> sandt = new ArrayList<Boolean>();
        sandt.add(true);
        sandt.add(false);
        sandt.add(true);
        System.out.println(sandt);
        System.out.println(sandt.size());

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int sum = 0;
        numbers.add(8432);
        numbers.add(922);
        numbers.add(432);
        numbers.add(524);
        for (Integer i:numbers) {
            sum += i;
            System.out.println(sum);
        }
        Collections.sort(numbers); //Collections.sort(); sortere ting, fx numbers Array fra mindst til højest, eller String i alfabetisk orden
        System.out.println(numbers);
        }
    }

