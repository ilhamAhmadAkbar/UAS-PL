import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahInput = 10;
        int kelipatanLima = 0;

        for(int i = 0; i < jumlahInput; i++) {
            int angka = input.nextInt();
            if(angka % 5 == 0) {
                kelipatanLima++;
            }
        }

        System.out.println("angka yang kelipatan 5 = " + kelipatanLima);
    }
}
