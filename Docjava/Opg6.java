public class Opg6 {
    public static void main(String[] args) {

        int x = 15;
        int y = 11;
        int z = 23;

        if(x>y && x<z || x>z && x<y) {
            System.out.println(x);
        }
        if(y>x && y<z || y<x && y>z) {
            System.out.println(y);
        }
        if(z>x && z<y || z<x && z>y){
            System.out.println(z);
        }




        /*
        Test case
        1:
        Input: x = 15 , y = 11 , z = 23
        Forventet output: 11

        2:
        Input: x = 11 , y = 45 , z = 42
        Forventet output: 42
         */
    }
}
