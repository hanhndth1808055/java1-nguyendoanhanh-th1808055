package assignment2;

import java.util.Scanner;

public class SoNguyenTo {
    public int x;
    private int a;
    public int soNguyenToTiepTheo;

    public void nhapSo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap so: ");
        x = scanner.nextInt();
        setA(x);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if (isSoNguyenTo(a)) {
            this.a = a;
            System.out.println("So nguyen to da nhap la: " + this.a);
        } else {
            System.out.println("Khong the nhap so nay, day khong phai so nguyen to.");
            nhapSo();
        }
    }

    public boolean isSoNguyenTo(int x) {
        if (x == 1) {
            return false;
        }
        if (x == 2) {
            return true;
        }

        if (x % 2 == 0) {
            return false;
        }
        if (x == 3) {
            return true;
        }

        for (int i = 3; i < x / 2; i += 2) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int timSoNguyenToTiepTheo(int x) {
        for (int i = x + 1; i > x; i++) {
            if (isSoNguyenTo(i)) {
                soNguyenToTiepTheo = i;
                break;
            }
        }
        System.out.println("So nguyen to tiep theo la: " + soNguyenToTiepTheo);
        return soNguyenToTiepTheo;
    }
}
