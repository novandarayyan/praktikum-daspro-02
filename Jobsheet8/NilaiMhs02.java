import java.util.Scanner;

public class NilaiMhs02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama;
        float nilai, nilaiTotal = 0, nilaiAkhir = 0;
        System.out.print("Masukkan Nama Mahasiswa: ");
        nama = sc.next();

        do {
            System.out.print("Masukkan Nilai Kuis: ");
            nilai = sc.nextInt();
            nilai = nilai / 35;
            nilai = nilai * 10;
            nilaiTotal = nilai + nilaiTotal;
            System.out.print("Masukkan Nilai UTS: ");
            nilai = sc.nextInt();
            nilai = nilai / 15;
            nilai = nilai * 10;
            nilaiTotal = nilai + nilaiTotal;
            System.out.print("Masukkan Nilai UAS: ");
            nilai = sc.nextInt();
            nilai = nilai / 30;
            nilai = nilai * 10;
            nilaiTotal = nilai + nilaiTotal;
            do {
                System.out.print("Masukkan Nilai Tugas: ");
                nilai = sc.nextInt();
                nilai = nilai / 20;
                nilai = nilai * 10;
                nilaiTotal = nilai + nilaiTotal;
            } while (nilai < 2);
            System.out.println("Nilai total: " + nilaiTotal);

        } while (nilai >= 100);

        sc.close();
    }
}
