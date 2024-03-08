package Cicleee;

public class Btap_Cicle {
    public static void main(String[] args) {
        cicle c1 = new cicle();
        cicle c2 = new cicle(5,"red");
        c1.setColor("black");
        c1.setRadius(3);
        System.out.println(c1.display());
        System.out.println(c2.display());
        System.out.println(c1.Perimeter());
        System.out.println(c2.Perimeter());
    }
}
