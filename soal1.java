import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class soal1 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan sebuah angka: ");

        try {
            int angka = Integer.parseInt(reader.readLine());

            if (angka % 5 == 0) {
                System.out.println("Angka " + angka + " adalah kelipatan 5.");
            } else {
                System.out.println("Angka " + angka + " bukan kelipatan 5.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid! Input harus berupa angka.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
