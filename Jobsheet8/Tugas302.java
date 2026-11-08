//Tugas 3 (uji wajib) jumlahToko | 2 + (2 mod 3) = 4
import java.util.Scanner;
public class Tugas302 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahToko;
        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1.");
            }
        } while (jumlahToko < 1);

        int totalBarangSeluruhToko = 0;
        int maxBarang = -1;
        int tokoTerbanyak = 0;
        String ringkasan = "";

        for (int i = 1; i <= jumlahToko; i++) {
            System.out.println("Toko " + i);

            int jumlahPelanggan;
            do {
                System.out.print("Masukkan jumlah pelanggan: ");
                jumlahPelanggan = sc.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif.");
                }
            } while (jumlahPelanggan < 0);

            int totalBarangToko = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                int jumlahBarang;
                do {
                    System.out.print("Jumlah barang pelanggan " + j + ": ");
                    jumlahBarang = sc.nextInt();
                    if (jumlahBarang < 0) {
                        System.out.println("Jumlah barang tidak boleh negatif.");
                    }
                } while (jumlahBarang < 0);

                totalBarangToko += jumlahBarang;
            }

            ringkasan += "Toko " + i + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko + "\n";
            totalBarangSeluruhToko += totalBarangToko;

            if (totalBarangToko > maxBarang) {
                maxBarang = totalBarangToko;
                tokoTerbanyak = i;
            }
            System.out.println();
        }

        System.out.println("Ringkasan yang diharapkan:");
        System.out.print(ringkasan);
        System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        sc.close();
    }
}