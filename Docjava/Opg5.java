public class Opg5 {
    public static void main(String[] args) {

        // int x = 77;
/*
        if(x <= 9) {
            System.out.println(x + " tilhører [0:9]");
        }else if (x > 9 && x <= 19)
            System.out.println(x + " tilhører [10:19]");
        else if (x > 19 && x <= 29)
            System.out.println(x + " tilhører [20:29]");
        else if (x > 29 && x <= 39)
            System.out.println(x + " tilhører [30:39]");
        else if (x > 39 && x <= 49)
            System.out.println(x + " tilhører [40:49]");
        else if (x > 49 && x <= 59)
            System.out.println(x + " tilhører [50:59]");
        else if (x > 59 && x <= 69)
            System.out.println(x + " tilhører [60:69]");
        else if (x > 69 && x <= 79)
            System.out.println(x + " tilhører [70:79]");
        else if (x > 79 && x <= 89)
            System.out.println(x + " tilhører [80:89]");
        else if (x > 89 && x <= 99)
            System.out.println(x + " tilhører [90:99]");
        */

        int x = 77;
        int y = x/10;
        System.out.println(x + " tilhører ["+ y*10 + ":"+ (y*10+9) +"]");




        /*
        Test case 5:
        Test 1:
        Input: x = 44
        Forventet output: 44 tilhører [40:49]

        Test 2:
        Input: x = 66
        Forventet output: 66 tilhører [60:69]

        Test 2:
        Input: x = 100
        Forventet output: 100 er ikke inde for intervallet [0:99]
         */
    }
}
