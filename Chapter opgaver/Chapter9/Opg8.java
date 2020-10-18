package Chapter9;

public class Opg8 {
    public static void main(String[] args) {

        Fan Fan1 = new Fan();
        Fan1.setSpeed(Fan1.FAST);
        Fan1.setColor("yellow");
        Fan1.setRadius(10);
        Fan1.turnOn();

        Fan Fan2 = new Fan();
        Fan2.setSpeed(Fan2.FAST);
        Fan2.setColor("blue");
        Fan2.setRadius(5);
        Fan2.turnOff();

        System.out.println(Fan1.toString());
        System.out.println(Fan2.toString());
    }
}
class Fan {
    final int SLOW;
    final int MEDIUM;
    final int FAST;
    private int speed;
    private boolean on;
    private double radius;
    String color;

    Fan() {
        SLOW = 1;
        MEDIUM = 2;
        FAST = 3;
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }
    //Mutator methods
    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }
    public void setRadius(double newRadius) {
        radius = newRadius;
    }
    public void setColor(String newColor) {
        color = newColor;
    }
    public void turnOn() {
        on = true;
    }
    public void turnOff(){
        on = false;
    }
    //Accessor
    public int getSpeed() {
        return speed;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public boolean isOn() {
        return on;
    }
    //Method
    public String toString() {
        if (on == true) {
            return "Speed: " + speed + ". Color: " + color + ". Radius: " + radius;
        }
        else  {
            return "Color: " + color + ". Radius: " + radius + ". The fan is off.";
        }
    }
}