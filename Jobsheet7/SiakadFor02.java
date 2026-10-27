import java.util.Scanner;
public class SiakadFor02 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double[] nilai = new double[10];

    for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai kuis mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextDouble();
        }
        double nilaiTertinggi = nilai[0];
        double nilaiTerendah = nilai[0];
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 1; i < 10; i++) {
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }
            if (nilai[i] >= 57) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }
        System.out.println("Nilai Tertinggi : " + nilaiTertinggi);
        System.out.println("Nilai Terendah  : " + nilaiTerendah);
        System.out.println("Jumlah Mahasiswa Lulus     : " + jumlahLulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus : " + jumlahTidakLulus);

    sc.close();   
    }
}