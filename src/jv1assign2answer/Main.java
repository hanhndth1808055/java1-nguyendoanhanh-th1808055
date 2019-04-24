package jv1assign2answer;

public class Main {
    public static void main(String args[]){
        SoNguyenTo snt = new SoNguyenTo();
        snt.setA(1);
        for (int i = 0; i < 20; i++){
            System.out.println("SNT: " + snt.timSoNguyenToTiepTheo());
        }
    }
}
