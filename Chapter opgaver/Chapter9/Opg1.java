package Chapter9;

public class Opg1 {
    public static void main(String[] args) {

        rectangle rectangle1 = new rectangle(4 , 40);
        System.out.println("Rectangle has a width and height of " + rectangle1.width + " and " + rectangle1.height + ", an area of " + rectangle1.getArea() + " and perimeter of " + rectangle1.getPerimeter() + ".");

        rectangle rectangle2 = new rectangle(3.5,35.9);
        System.out.println("Rectangle has a width and height of " + rectangle2.width + " and " + rectangle2.height + ", an area of " + rectangle2.getArea() + " and perimeter of " + rectangle2.getPerimeter() + ".");

    }
}

        class rectangle {
            double height;
            double width;

            rectangle() {
                height = 1;
                width = 1;
            }
            rectangle(double newHeight, double newWidth) {
                height = newHeight;
                width = newWidth;
            }
            double getArea() {
                return height * width;
            }
            double getPerimeter() {
                return height + width + height + width;
            }
}

