import java.util.Scanner;
public class StudiKasus102 {
    public static void main(String[] args) {
        int hargaMinimalDiskon = 100000;
        int hargaPerCup = 17000;
        int totalBayar = 0;
        int jumlahCup;
        int uangBayar;
        int totalHarga; 
        int diskon;
        int kembalian;
        int kurang;

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah cup: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang bayar: ");
        uangBayar = sc.nextInt();

        totalHarga = hargaPerCup * jumlahCup;
        diskon = 0;

        if (totalHarga >= hargaMinimalDiskon) {
            diskon = totalHarga * 10 / 100;}
        
        totalBayar = totalHarga - diskon;

        System.out.println("Total harga: " + totalHarga);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total bayar: " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian: " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang kurang: " + kurang);
        }

    }
}