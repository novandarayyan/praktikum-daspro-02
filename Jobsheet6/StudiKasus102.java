import java.util.Scanner;
public class StudiKasus102 {
    public static void main(String[] args) {
        int hargaMinimalDiskon, nomorAbsenNovan = 2;
        hargaMinimalDiskon = 80000 + ((nomorAbsenNovan % 5) * 10000);
        int hargaPerCup = 15000 + ((hargaMinimalDiskon % 6)* 1000);

        System.out.print("Parameter unik saya absen 2: " hargaMinimalDiskon);
        System.out.printIn(hargaPerCup);

        int jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah cup: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang bayar: ");
        uangBayar = sc.nextInt();

        totalHarga = hargaPerCup * jumlahCup;
        diskon = 0;


    }
}