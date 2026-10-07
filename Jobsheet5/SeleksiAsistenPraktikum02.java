import java.util.Scanner;
public class SeleksiAsistenPraktikum02 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Apakah Anda mahasiswa aktif? (true/false): ");
    boolean mahasiswaAktif = sc.nextBoolean();
    System.out.print("Apakah Anda sedang mendapatkan sanksi akademik? (true/false): ");
    boolean sedangDisanksi = sc.nextBoolean();

    if (mahasiswaAktif && !sedangDisanksi) {
            
        System.out.print("Masukkan nilai Dasar Pemrograman (0-100): ");
        double nilaiDasarPemrograman = sc.nextDouble();

        System.out.print("Apakah Anda memiliki sertifikat kompetensi pemrograman? (true/false): ");
        boolean punyaSertifikat = sc.nextBoolean();

        if (nilaiDasarPemrograman >= 80 || punyaSertifikat) {
                
            System.out.println("Anda lolos ke tahap wawancara!");
                
            System.out.print("Masukkan nilai wawancara (0-100): ");
            double nilaiWawancara = sc.nextDouble();

            if (nilaiWawancara >= 75) {
                System.out.println("Selamat! Anda diterima sebagai Asisten Praktikum.");
            } else {
                System.out.println("Seleksi Gagal (Tahap 3): Nilai wawancara tidak memenuhi batas minimal 75.");
                }

        } else {
            System.out.println("Seleksi Gagal (Tahap 2): Nilai Dasar Pemrograman kurang dari 80 dan tidak memiliki sertifikat kompetensi.");
        }

    } else {
        System.out.println("Seleksi Gagal (Tahap 1): Status mahasiswa tidak memenuhi syarat (harus mahasiswa aktif dan tidak sedang disanksi akademik).");
    }

    sc.close();
    }
}