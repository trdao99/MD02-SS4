public class Sinhvien {
    private String nameSV;
    private String svCode;
    private int svAge;
    private boolean svSex;


    public Sinhvien() {
    }

    ;

    public Sinhvien(String nameSV, String svCode, Integer svAge, Boolean svSex) {
        this.nameSV = nameSV;
        this.svCode = svCode;
        this.svAge = svAge;
        this.svSex = svSex;
    }

    ;

    public String getNameSV() {
        return nameSV;
    }

    public String getSvCode() {
        return svCode;
    }

    public Integer getSvAge() {
        return svAge;
    }

    public Boolean getSvSex() {
        return svSex;
    }

    public void setNameSV(String nameSV) {
        this.nameSV = nameSV;
    }

    public void setSvCode(String svCode) {
        this.svCode = svCode;
    }

    public void setSvAge(Integer svAge) {
        this.svAge = svAge;
    }

    public void setSvSex(Boolean svSex) {
        this.svSex = svSex;
    }

    public String DisplayDatas() {
        String datas = "name: " + nameSV +
                "\n msv: " + svCode +
                "\n age: " + svAge +
                "\n sex: " + (svSex ? "nam" : "nu");
        return datas;
    }

    ;
}