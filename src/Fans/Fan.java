package Fans;

public class Fan {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public Fan() {
        this.speed = slow;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (on) {
            return "Speed: "+ speed+
                    "\nColor: " + color+
                    "\nRadius: "+ radius+
                    "\nfan is on";
        }
        else {
            return "Speed: 0"+
                    "\nColor: " + color+
                    "\nRadius: "+ radius+
                    "\nfan is of";}
    }
}
