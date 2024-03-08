
package Quadratic;

public class QuadraticEquation {
    private int a;
    private int b;
    private int c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getDiscriminant() {
        return (int) (b * b - 4 * a * c);
    }

    public int getRoot1() {
        return (int) ((-b + Math.pow((b * b - 4 * a * c), 0.5)) / (2 * a));
    }

    public int getRoot2() {
        return (int) ((-b - Math.pow((b * b - 4 * a * c), 0.5)) / (2 * a));
    }
}