import java.util.ArrayList;
import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang array: ");
        int length = input.nextInt();
        int[] arr = new int[length];

        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Masukkan angka yang ingin dicari: ");
        int num = input.nextInt();

        int[] indexArr = searchIndex(arr, num);

        if (indexArr.length == 0) {
            System.out.println("Angka tidak ditemukan dalam array.");
        } else {
            System.out.print("Angka ditemukan pada indeks: ");
            for (int i = 0; i < indexArr.length; i++) {
                System.out.print(indexArr[i] + " ");
            }
        }
    }

    public static int[] searchIndex(int[] arr, int num) {
        ArrayList<Integer> tempArr = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                tempArr.add(i);
            }
        }

        int[] indexArr = new int[tempArr.size()];
        for (int i = 0; i < tempArr.size(); i++) {
            indexArr[i] = tempArr.get(i);
        }

        return indexArr;
    }
}
