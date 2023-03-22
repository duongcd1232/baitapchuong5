package cau2;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        hinhchunhat hcn=new hinhchunhat();
        System.out.print("Nhap cd:");
        Scanner sc=new Scanner(System.in);
        hcn.setCd(sc.nextFloat());
        System.out.print("Nhap cr:");
        hcn.setCr(sc.nextFloat());
        System.out.println("Dien tich= "+hcn.dientich());
        hinhtron ht=new hinhtron();
        System.out.print("Nhap r:");
        ht.setR(sc.nextFloat());
        System.out.println("Dien tich="+ht.dientich());
    }
}