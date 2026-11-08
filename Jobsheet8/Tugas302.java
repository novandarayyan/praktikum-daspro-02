
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

        sc.close();
    }
}