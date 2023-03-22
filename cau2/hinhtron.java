package cau2;

public class hinhtron extends hinhhoc{
    private double r;
    public hinhtron(){
    }
    public hinhtron(double r){
        r=0;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String toString() {
        return "HinhTron{" + "r=" + r + '}';
    }
    public double dientich(){
        return 3.14*r;
    }
}