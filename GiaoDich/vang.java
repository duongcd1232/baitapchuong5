package GiaoDich;

public class vang extends GiaoDich {

    private String loaivang;

    public vang(String a1, String string, int par, int par1, String string1) {

    }

    public vang(String loaivang) {
        this.loaivang = loaivang;
    }

    public vang(String loaivang, String magiaodich, String ngaygiaodich, int dongia, int soluong) {
        super(magiaodich, ngaygiaodich, dongia, soluong);
        this.loaivang = loaivang;
    }

  
    public String getLoaivang() {
        return loaivang;
    }

    public void setLoaivang(String loaivang) {
        this.loaivang = loaivang;
    }

    public double thanhtien() {
        return super.getSoluong() * super.getDongia();
    }

    @Override
    public String toString() {
        return "Vang{" + "loaivang=" + loaivang + '}';
    }

}