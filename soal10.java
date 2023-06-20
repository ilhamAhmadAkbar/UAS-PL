import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class soal10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang array: ");
        int length = input.nextInt();
        int[] arr = new int[length];

        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < length; i++) {
            arr[i] = input.nextInt();
        }

        int[] kelipatan5 = searchKelipatan5(arr);

        if (kelipatan5.length == 0) {
            System.out.println("Tidak ada angka kelipatan 5 dalam array.");
        } else {
            System.out.print("Angka kelipatan 5 dalam array adalah: ");
            for (int i = 0; i < kelipatan5.length; i++) {
                System.out.print(kelipatan5[i] + " ");
            }
        }
    }

    public static int[] searchKelipatan5(int[] arr) {
        ArrayList<Integer> tempArr = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0) {
                tempArr.add(arr[i]);
            }
        }

        Collections.sort(tempArr); // Mengurutkan array kelipatan 5 dari terkecil ke terbesar.

        int[] kelipatan5Arr = new int[tempArr.size()];
        for (int i = 0; i < tempArr.size(); i++) {
            kelipatan5Arr[i] = tempArr.get(i);
        }

        return kelipatan5Arr;
    }
}
