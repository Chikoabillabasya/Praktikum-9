import java.util.Scanner;

public class ArrayNilai07 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner (System.in);

        int[] nilaiAkhir = new int [10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = input07.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai akhir ke-"+i+" adalah "+nilaiAkhir[i]);
        }
    }
}