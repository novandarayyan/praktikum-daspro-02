import java.util.Scanner;

public class PakDanur02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double gajiPokok, tunjanganPerAnak, totalTunjangan, potonganPensiun, gajiBersih;
        int jmlAnak;
        double persentasePensiun = 0.10;
        System.out.print("Masukkan gaji pokok: ");
        gajiPokok = sc.nextDouble();
        System.out.print("Masukkan tunjangan anak per bulan (per anak): ");
        tunjanganPerAnak = sc.nextDouble();
        System.out.print("Masukkan jumlah anak: ");
        jmlAnak = sc.nextInt();
        totalTunjangan = jmlAnak * tunjanganPerAnak;
        potonganPensiun = persentasePensiun * gajiPokok;
        gajiBersih = gajiPokok + totalTunjangan - potonganPensiun;
        System.out.println("\n--- Rincian Gaji ---");
        System.out.println("Total Tunjangan Anak : Rp " + totalTunjangan);
        System.out.println("Potongan Dana Pensiun: Rp " + potonganPensiun);
        System.out.println("Gaji Bersih          : Rp " + gajiBersih);
        sc.close();
    }
}