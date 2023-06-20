import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class soal08 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Memasukkan teks ke dalam array
        String[] texts = {"ilham", "saya", "kuliah", "di", "uin", "suska"};

        System.out.print("Masukkan panjang minimum: ");
        int minLength = Integer.parseInt(reader.readLine());
        System.out.print("Masukkan panjang maksimum: ");
        int maxLength = Integer.parseInt(reader.readLine());

        List<Integer> foundIndexes = findTextIndexes(texts, minLength, maxLength);

        if (foundIndexes.isEmpty()) {
            System.out.println("Tidak ditemukan teks dengan panjang dalam rentang tersebut.");
        } else {
            System.out.println("Indeks yang ditemukan:");
            for (int index : foundIndexes) {
                System.out.println(index);
            }
        }
    }

    public static List<Integer> findTextIndexes(String[] texts, int minLength, int maxLength) {
        List<Integer> foundIndexes = new ArrayList<>();

        for (int i = 0; i < texts.length; i++) {
            String text = texts[i];
            int textLength = text.length();

            if (textLength >= minLength && textLength <= maxLength) {
                foundIndexes.add(i);
            }
        }

        return foundIndexes;
    }
}
