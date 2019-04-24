package labSession3;

import java.util.Scanner;
import java.lang.Math;

public class TamGiac {
    public double canh_1;
    public double canh_2;
    public double canh_3;

    public TamGiac(double canh_1, double canh_2, double canh_3) {
        this.canh_1 = canh_1;
        this.canh_2 = canh_2;
        this.canh_3 = canh_3;
        for (;;){
            if (!kiemTraTamGiac()) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Moi nhap canh 1: ");
                this.canh_1 = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Moi nhap canh 2: ");
                this.canh_2 = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Moi nhap canh 3: ");
                this.canh_3 = scanner.nextDouble();
                scanner.nextLine();
            } else {
             System.out.println("Nhap thanh cong.");
             break;
            }
        }

    }

    public boolean kiemTraTamGiac(){
        if (canh_1 <= 0 || canh_2 <= 0 || canh_3 <= 0 || canh_1 + canh_2 <= canh_3 || canh_1 + canh_3 <= canh_2 || canh_2 + canh_3 <= canh_1) {
            return false;
        }
        return true;
    }

    public double tinhChuVi() {
        return canh_1 + canh_2 + canh_3;
    }

    public double tinhDienTich() {
        return Math.sqrt((canh_1 + canh_2 + canh_3) * (canh_1 + canh_2 - canh_3) * (canh_2 + canh_3 - canh_1) * (canh_3 + canh_1 - canh_2)) / 4;
    }

    public void inChuViDienTich() {
        System.out.println("Chu vi cua tam giac vua nhap la: " + tinhChuVi());
        System.out.println("Dien tich cua tam giac vua nhap la: " + tinhDienTich());
    }

}
