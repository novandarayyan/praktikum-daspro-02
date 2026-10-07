import java.util.Scanner;

public class PakTono02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double panjang, lebar, diameter, sisi;
        double luasTanah, luasKolam, luasTaman, luasSisa;
        System.out.print("Masukkan panjang tanah (m): ");
        panjang = sc.nextDouble();
        System.out.print("Masukkan lebar tanah (m): ");
        lebar = sc.nextDouble();
        System.out.print("Masukkan diameter kolam ikan (m): ");
        diameter = sc.nextDouble();
        System.out.print("Masukkan sisi taman bunga (m): ");
        sisi = sc.nextDouble();
        luasTanah = panjang * lebar;
        double r = diameter / 2.0;
        luasKolam = Math.PI * r * r;
        luasTaman = sisi * sisi;
        luasSisa = luasTanah - (luasKolam + luasTaman);
        System.out.println("\n--- Hasil Perhitungan Luas ---");
        System.out.println("Luas Tanah Total  : " + luasTanah + " m²");
        System.out.println("Luas Kolam Ikan   : " + luasKolam + " m²");
        System.out.println("Luas Taman Bunga  : " + luasTaman + " m²");
        System.out.println("Luas Tanah Sisa   : " + luasSisa + " m²");
        sc.close();
    }
}