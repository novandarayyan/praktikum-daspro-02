import java.util.Scanner;
public class KafeDoWhile02 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 17000;

        int jumlahKopi, jumlahTeh, jumlahRoti;
        int totalHarga;
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan. Program selesai.");
                break;
            }
            System.out.print("Masukkan jumlah kopi : ");
            jumlahKopi = sc.nextInt();
            System.out.print("Masukkan jumlah teh  : ");
            jumlahTeh = sc.nextInt();
            System.out.print("Masukkan jumlah roti : ");
            jumlahRoti = sc.nextInt();

            totalHarga = (jumlahKopi * hargaKopi) + (jumlahTeh * hargaTeh) + (jumlahRoti * hargaRoti);
            System.out.println("Total yang harus dibayar oleh " + namaPelanggan + ": Rp " + totalHarga);
            sc.nextLine();
        } while (true);
        sc.close();
    }
}
