import java.util.Arrays;
import java.util.Scanner;

public class soal6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = {"andi", "siti", "deri", "sinta", "amet", "elit"};

        System.out.print("Masukkan teks yang ingin dicari: ");
        String keyword = input.nextLine();

        int[] foundIndex = searchArr(arr, keyword);

        if (foundIndex.length == 0) {
            System.out.println("Teks tidak ditemukan dalam array.");
        } else {
            System.out.print("Teks ditemukan pada index: ");
            for (int i = 0; i < foundIndex.length; i++) {
                System.out.print(foundIndex[i] + " ");
            }
        }
    }

    public static int[] searchArr(String[] arr, String keyword) {
        int[] foundIndex = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toLowerCase().contains(keyword.toLowerCase())) {
                foundIndex[index] = i;
                index++;
            }
        }
        return Arrays.copyOfRange(foundIndex, 0, index);
    }
}
