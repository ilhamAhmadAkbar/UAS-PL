import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        if (angka % 5 == 0) {
            System.out.println(angka + " adalah kelipatan 5");
        } else {
            System.out.println(angka + " bukan kelipatan 5");
        }
    }
}
