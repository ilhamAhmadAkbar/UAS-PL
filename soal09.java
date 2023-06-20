import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class soal09 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Masukkan panjang array: ");
            int length = Integer.parseInt(reader.readLine());

            int[] array = new int[length];

            System.out.println("Masukkan elemen-elemen array:");
            for (int i = 0; i < length; i++) {
                array[i] = Integer.parseInt(reader.readLine());
            }

            int resultIndex = searchMaxMultipleOfFive(array);

            if (resultIndex != -1) {
                System.out.println("Angka terbesar kelipatan 5 ditemukan pada indeks: " + resultIndex);
            } else {
                System.out.println("Tidak ada angka terbesar kelipatan 5 dalam array.");
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca input.");
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static int searchMaxMultipleOfFive(int[] array) {
        int maxMultipleOfFive = Integer.MIN_VALUE;
        int maxMultipleOfFiveIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0 && array[i] > maxMultipleOfFive) {
                maxMultipleOfFive = array[i];
                maxMultipleOfFiveIndex = i;
            }
        }

        return maxMultipleOfFiveIndex;
    }
}
