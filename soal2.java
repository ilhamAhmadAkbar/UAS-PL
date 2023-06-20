import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class soal2 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Masukkan teks: ");
            String text = reader.readLine();

            if (text.length() == 5) {
                System.out.println("Panjang teks adalah 5 karakter");
            } else {
                System.out.println("Panjang teks bukan 5 karakter");
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca input");
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
