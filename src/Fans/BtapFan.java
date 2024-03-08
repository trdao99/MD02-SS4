package Fans;

import Fans.Fan;

public class BtapFan {
    public static void main(String[] args) {
        Fan fan1= new Fan();
        fan1.setOn(false);
        fan1.setColor("Red");
        fan1.setRadius(10);
        System.out.println(fan1.toString());
    }
}
