import java.util.Scanner;

public class P12Tugas202 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("Daftar Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }

        System.out.print("\nCari menu: ");
        String cari = input.nextLine();
        int idxCari = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                idxCari = i;
                break;
            }
        }
        if (idxCari != -1) {
            System.out.println("Tersedia: " + menu[idxCari] + " (Rp " + harga[idxCari] + ")");
        } else {
            System.out.println("Menu tidak tersedia.");
        }

        System.out.print("\nMasukkan jumlah pesanan: ");
        int jumlah = input.nextInt();
        input.nextLine();

        String[] pesanan = new String[jumlah];
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Pesanan ke-" + (i + 1) + ": ");
            String nama = input.nextLine();

            int idx = -1;
            for (int j = 0; j < menu.length; j++) {
                if (menu[j].equalsIgnoreCase(nama)) {
                    idx = j;
                    break;
                }
            }

            if (idx != -1) {
                pesanan[i] = menu[idx];
                total += harga[idx];
            } else {
                System.out.println("Menu tidak tersedia, masukkan ulang.");
                i--;
            }
        }

        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < pesanan.length; i++) {
            System.out.println((i + 1) + ". " + pesanan[i]);
        }
        System.out.println("Total Biaya: Rp " + total);

        input.close();
    }
}