package cau2;

public class hinhchunhat extends hinhhoc {

    private float cd;
    private float cr;

    public hinhchunhat(){
    }
    public hinhchunhat(float cd,float cr) {
        
    }

    public float getCd() {
        return cd;
    }

    public void setCd(float cd) {
        this.cd = cd;
    }

    public float getCr() {
        return cr;
    }

    public void setCr(float cr) {
        this.cr = cr;
    }
    

    @Override
    public String toString() {
        return "HinhChuNhat{" + "cd=" + cd + ", cr=" + cr + '}';
    }

    @Override
    public double dientich() {
        return (cd+cr)*2;
    }
}