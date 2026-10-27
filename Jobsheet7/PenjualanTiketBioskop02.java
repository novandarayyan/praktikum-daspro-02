import java.util.Scanner;
public class PenjualanTiketBioskop02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int HARGA_TIKET = 44000;
        int totalTiketTerjual = 0;
        double totalPenjualanHariIni = 0;
        int jumlahTiket;
        String lanjut;
            
            while (true) {
            System.out.print("\nMasukkan jumlah tiket yang dibeli (ketik 'batal'/bukan angka untuk keluar): ");
            
            if (!sc.hasNextInt()) {
                break;
            }

            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Masukkan angka positif.");
                continue;
            }

            if (jumlahTiket == 0) {
                System.out.println("Jumlah tiket harus lebih dari 0.");
                continue;
            }

            double diskon = 0.0;
            if (jumlahTiket > 10) {
                diskon = 0.17; 
            } else if (jumlahTiket > 5) {
                diskon = 0.10; 
            }

            double totalHargaSebelumDiskon = jumlahTiket * HARGA_TIKET;
            double potonganHarga = totalHargaSebelumDiskon * diskon;
            double totalHargaTransaksi = totalHargaSebelumDiskon - potonganHarga;

            totalTiketTerjual += jumlahTiket;
            totalPenjualanHariIni += totalHargaTransaksi;

            System.out.println("Jumlah Tiket    : " + jumlahTiket);
            System.out.println("Harga Kotor     : Rp " + (long) totalHargaSebelumDiskon);
            System.out.println("Diskon          : " + (int) (diskon * 100) + "%");
            System.out.println("Total Bayar     : Rp " + (long) totalHargaTransaksi);

            System.out.print("\nApakah ada transaksi lain? (y/n): ");
            lanjut = sc.next();
            if (lanjut.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("Total Tiket Terjual     : " + totalTiketTerjual + " tiket");
        System.out.println("Total Penjualan Kotor   : Rp " + (long) totalPenjualanHariIni);
        sc.close();
    }
}
