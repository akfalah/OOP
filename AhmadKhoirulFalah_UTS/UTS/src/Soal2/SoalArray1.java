package Soal2;

public class SoalArray1 {
    public static void main(String[] args) {
        int[][] arrayInt = {
                {1, 1, 4},
                {2, 1, 2},
                {3, 2, 1}
        };
        // hitung jumlah elemen array 2 dimensi
        int count = 0;

        // gunakan perulangan
        for (int[] arr : arrayInt) {
            for (int j = 0; j < arr.length; j++) {
                count++;
            }
        }

        System.out.println("Jumlah elemen array 2D = " + count);
    }
}
