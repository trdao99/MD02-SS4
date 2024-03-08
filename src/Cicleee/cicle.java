package Cicleee;

public class cicle {
    private int radius;
    private String color;
    public cicle(){

    };

    public cicle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public int Perimeter(){
        return (int) (this.radius*3.14*2);
    } public int Area(){
        return (int) (this.radius*3.14*this.radius);
    }
    public String display(){
        return "Cicleee.cicle có radius là: " + radius + "\n Cicleee.cicle có màu là: " + color;
    };
}
