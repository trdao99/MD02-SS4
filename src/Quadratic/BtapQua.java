package Quadratic;

import Quadratic.QuadraticEquation;

import java.util.Scanner;

public class BtapQua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuadraticEquation baiToan = new QuadraticEquation();
        baiToan.setA(sc.nextInt());
        baiToan.setB(sc.nextInt());
        baiToan.setC(sc.nextInt());

        if (baiToan.getDiscriminant() >= 0) {
            System.out.println(baiToan.getRoot1());
            System.out.println(baiToan.getRoot2());
        }
    }
}