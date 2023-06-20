import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah teks: ");
        String text = input.nextLine();

        if (text.length() == 5) {
            System.out.println("Teks tersebut memiliki panjang 5 karakter.");
        } else {
            System.out.println("Teks tersebut tidak memiliki panjang 5 karakter.");
        }
    }
}
