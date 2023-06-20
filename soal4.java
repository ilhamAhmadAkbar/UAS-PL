import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Input ke-" + i + ": ");
            String text = input.nextLine();
            if (text.length() == 5) {
                count++;
            }
        }
        System.out.println("Banyak teks yang panjangnya 5 karakter: " + count);
    }
}
