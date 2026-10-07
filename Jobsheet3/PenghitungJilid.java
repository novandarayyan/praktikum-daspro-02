import java.util.Scanner;

public class PenghitungJilid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int lembarJumlah;
        double biayaPerLembar=500;
        double biayaJilid=5000;

        System.out.println("Masukkan jumlah lembar yang ingin diprint: ");
        lembarJumlah = sc.nextInt();

        double biayaTotal;

        biayaTotal = ( lembarJumlah * biayaPerLembar ) + biayaJilid;

        System.out.println("Total bayar print serta jilid: Rp: " +biayaTotal);
        }
    }
