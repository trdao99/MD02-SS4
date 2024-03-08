package SInhvien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sinhvien[] sinhviens = new Sinhvien[100];
        int sinviencount= 0;
        int choice;
        do {
            System.out.println("1.Xem sinh vien");
            System.out.println("2.THem sinh vien");
            System.out.println("3.sua");
            System.out.println("4.xoa");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    for (int i = 0; i < sinviencount; i++) {
                        sinhviens[i].display();
                    }break;
                case 2:
                    sinhviens[sinviencount] = new Sinhvien();
                    sinhviens[sinviencount].input();
                    sinviencount++;
                    break;
                case 3:
                    System.out.println("Nhaapj id sinh vien muon sua");
                    int id = scanner.nextInt();
                    for (int i = 0; i < sinviencount; i++) {
                        if (sinhviens[i].getIdsv()==id){
                            sinhviens[i].input();
                            break;
                        }
                    }
                    break;
                case 4:

            }
        }while (true);
    }
}
