package SInhvien;

import java.util.Scanner;

public class Sinhvien {
    private int idsv;
    private String name;
    private String address;

    public Sinhvien() {
    }

    public void setIdsv(int idsv) {
        this.idsv = idsv;
    }

    public int getIdsv() {
        return idsv;
    }

    public Sinhvien(int idsv, String name, String address) {
        this.idsv = idsv;
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void input(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap id");
        idsv= Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap id");
        name= scanner.nextLine();
        System.out.println("Nhap id");
         address= scanner.nextLine();
    }
    public void display(){
        System.out.println("Sinhvien{" +
                "id=" + idsv +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}');
    }

}
