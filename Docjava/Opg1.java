public class Opg1 {
    public static void main(String[] args) {

        int x = 5;
        int y = 8;
        int z = 3;



        /*
        Test case A:
        Input: x = 5, y = 8, z = 3
        Forventet output: True


        A: x <= 5 && z != y   , Udtrykket fungerer hvis begge giver true (&& = and), så den er True
        B: x == 5 || x == y && z == 3  ,  True fordi kun en side skal være true, da 5 == x med vores integers
        C: x / y > z / x  ,  Giver true hvis 5/8 er større end 3/5, er False da java runder ned
        D: !( x != y-z ) == false  ,  Bliver false, da i parentesen er den False, og bliver lavet så om til True og siden True ikke == False, er denne her False.
        E: 2*x != x || x == 0   ,  True fordi kun en side skal være korrekt, 2*5 ikke = 5
        F: !true || !false  ,  True fordi bare en side af || skal være true (|| = or)
         */


    }
}
