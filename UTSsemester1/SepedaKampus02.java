import java.util.Scanner;
public class SepedaKampus02 {
public static void main(String[] args) {
    //parameters 
    //tarif kode 1 = 5000 + (P mod 4) x 1000 = 5000
    //kode 2 = 12000 + (P mod 4) x 1000
    //kode 3
    //banyak jam pertama yang dikenai harga penuh = 3
    //batas syarat diskon (jam) = 7 
    Scanner sc = new Scanner(System.in);
    int biayaDasar = 0, totalBayar, woah;
    double diskon = 0;
    int tarif1 = 5000 ,tarif2 = 12000 ,tarif3 = 8000; 
    System.out.print("Waktu lama parkir (jam): ");

    int waktuParkir = sc.nextInt();

    System.out.print("Jenis sepeda anda, 1 = Sepeda Biasa, 2 = Sepeda Listrik, 3 = Sepeda Tandem: ");
    int kodeLayanan = sc.nextInt(); 
    switch  (kodeLayanan){
        case 1: biayaDasar = tarif1 * waktuParkir;
        case 2: biayaDasar = tarif2 * waktuParkir;
        case 3: biayaDasar = tarif3 * waktuParkir;
    }

    System.out.println("Layanan: " + kodeLayanan);
    System.out.println("Biaya Total: " + biayaDasar);
    System.out.println("Diskon: " + diskon);
    System.out.println("Total Bayar: " + biayaDasar);

    }
}