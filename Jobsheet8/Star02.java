//Jalankan kembali program dengan n = (3 + (P mod 5)) dan n = (9 + (P mod 5)), dengan P 
//adalah nomor absen Anda (lihat Ketentuan Parameter Unik). Catat jumlah karakter * 
//yang muncul pada setiap pengujian.
//Percobaan 1 (uji tambahan, langkah 10)	3 + (2 mod 5)	5
//Percobaan 1 (uji tambahan, langkah 10) n (uji ke-2)	9 + (2 mod 5)	11
//Percobaan 1 (Pertanyaan 1 & 2) n	4 + (2 mod 4)	6
//Percobaan 1 (Pertanyaan 3) n	10 + (2 mod 6)	12
import java.util.Scanner;
public class Star02 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan nilai n = ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++){
        System.out.print("*");
    }
    System.out.println();
    sc.close();
}
}