import java.util.Scanner;
public class SistemDiskonTokoBuku02 {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jenis buku (kamus / novel / lainnya): ");
        String jenisBuku = sc.nextLine();

        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = sc.nextInt();

        int diskon = 0;

        if (jenisBuku.equalsIgnoreCase("kamus") && jumlahBuku > 2) {
            diskon = 12;
        } else if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 10;
        } else if (jenisBuku.equalsIgnoreCase("novel") && jumlahBuku > 3) {
            diskon = 9;
        } else if (jenisBuku.equalsIgnoreCase("novel") && jumlahBuku <= 3) {
            diskon = 8;
        } else if (!jenisBuku.equalsIgnoreCase("kamus") && !jenisBuku.equalsIgnoreCase("novel") && jumlahBuku > 3) {
            diskon = 5;
        } else {
            diskon = 0;
        }

        System.out.println("Diskon: " + diskon + "%");

        sc.close();
    }
}