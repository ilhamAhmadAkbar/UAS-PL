import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class soal07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] texts = {"saya", "kuliah", "di", "uin", "suska", "riau"};

        List<Integer> foundIndexes = findTextIndexes(texts, 5);

        if (foundIndexes.isEmpty()) {
            System.out.println("Tidak ditemukan teks dengan panjang 5 karakter.");
        } else {
            System.out.println("Indeks yang ditemukan:");
            for (int index : foundIndexes) {
                System.out.println(index);
            }
        }
    }

    public static List<Integer> findTextIndexes(String[] texts, int length) {
        List<Integer> foundIndexes = new ArrayList<>();

        for (int i = 0; i < texts.length; i++) {
            String text = texts[i];
            int textLength = text.length();

            if (textLength == length) {
                foundIndexes.add(i);
            }
        }

        return foundIndexes;
    }
}
