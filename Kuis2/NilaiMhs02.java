import java.util.Scanner;
public class NilaiMhs02 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String nama; 
    int nilaiKuis = 0, nilaiUAS, nilaiUTS, nilaiTugas;
    System.out.print("Masukkan Nama Mahasiswa: ");
    nama = sc.next();

    do (
        System.out.print("Masukkan Nilai Kuis: ");
        nilaiKuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        nilaiUTS = sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        nilaiUAS = sc.nextInt();
        do {System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas = sc.nextInt();
        } while (nilaiTugas < 2);
    );



    sc.close();
}
}