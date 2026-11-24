import java.util.Scanner;

public class Tugas202 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("=== DAFTAR MENU KAFE KAMPUS ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }

        System.out.print("\nCari menu yang ingin dipesan: ");
        String cariMenu = input.nextLine();
        int indeksCari = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMenu)) {
                indeksCari = i;
                break;
            }
        }

        if (indeksCari != -1) {
            System.out.println("Menu tersedia: " + menu[indeksCari] + " (Rp " + harga[indeksCari] + ")");
        } else {
            System.out.println("Menu \"" + cariMenu + "\" tidak tersedia.");
        }

        System.out.print("\nMasukkan jumlah item yang ingin dipesan: ");
        int jumlahPesanan = input.nextInt();
        input.nextLine();

        String[] daftarPesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[jumlahPesanan];
        int totalBiaya = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            boolean valid = false;
            while (!valid) {
                System.out.print("Masukkan nama menu pesanan ke-" + (i + 1) + ": ");
                String namaInput = input.nextLine();

                int indeksMenu = -1;
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(namaInput)) {
                        indeksMenu = j;
                        break;
                    }
                }

                if (indeksMenu != -1) {
                    daftarPesanan[i] = menu[indeksMenu];
                    hargaPesanan[i] = harga[indeksMenu];
                    totalBiaya += harga[indeksMenu];
                    valid = true;
                } else {
                    System.out.println("Menu tidak tersedia. Silakan masukkan nama menu yang ada di daftar.");
                }
            }
        }

        System.out.println("\n=== STRUK PESANAN KAFE KAMPUS ===");
        for (int i = 0; i < daftarPesanan.length; i++) {
            System.out.printf("%d. %-18s : Rp %d\n", (i + 1), daftarPesanan[i], hargaPesanan[i]);
        }
        System.out.println("-----------------------------------");
        System.out.println("Total Biaya           : Rp " + totalBiaya);

        input.close();
    }
}