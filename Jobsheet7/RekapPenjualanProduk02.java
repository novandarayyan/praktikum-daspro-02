import java.util.Scanner;
public class RekapPenjualanProduk02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTerjual, jenisProduk = 4, totalPerJenis = 0, jumlahHari = 4, totalPenjualan = 0;

        int i = 1;

        do {int j = 1;

            do {
            System.out.print("Masukkan jumlah penjualan produk " + i + " pada hari ke-" + j + ": ");
            jumlahTerjual = sc.nextInt();
            totalPerJenis = totalPerJenis + jumlahTerjual; 
            j++;
            } while (jumlahHari >= j );

            System.out.println("Total Produk " + i + " yaitu: " + totalPerJenis);
            totalPenjualan = totalPenjualan + totalPerJenis;
            totalPerJenis = 0;
            i++;
                
        } while (i < jenisProduk);

        System.out.println("Total Penjualan: " + totalPenjualan);

        sc.close();
    }
}