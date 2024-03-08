public class Ss4 {
    public static void main(String[] args) {
        Sinhvien sv1 = new Sinhvien();
        Sinhvien sv2 = new Sinhvien("dao","D08092004", 19, true);
        sv1.setSvCode("0123");
        System.out.println(sv1.DisplayDatas());
        System.out.println(sv2.DisplayDatas());

    }
}
