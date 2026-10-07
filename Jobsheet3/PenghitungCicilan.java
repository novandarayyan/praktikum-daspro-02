import java.util.Scanner;

public class PenghitungCicilan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double hargaLaptop;
        double bayarMuka;
        int waktuLamaCicil;
        double bungaTetap=0.02;

        System.out.println("Masukkan Harga Laptop: Rp.");
        hargaLaptop = sc.nextInt();

        System.out.println("Anda ingin bayar muka sebanyak: Rp.");
        bayarMuka = sc.nextInt();

        System.out.println("Anda ingin dalam berapa bulan: ");
        waktuLamaCicil = sc.nextInt();

        double bayarSisaMuka;
        double bayarCicilBulanan;

        bayarSisaMuka = hargaLaptop - bayarMuka;
        bayarCicilBulanan = (bayarSisaMuka/waktuLamaCicil)*bungaTetap + (bayarSisaMuka/waktuLamaCicil);

        System.out.println("Setiap Bulan Anda harus membayar: " +bayarCicilBulanan);
        }
    }
