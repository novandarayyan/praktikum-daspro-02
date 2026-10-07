import java.util.Scanner;

public class Tugas2Pemilihan02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah SKS anda: ");
        int jumlahSKS = sc.nextInt();

        if (jumlahSKS > 24) {
            System.out.println("Melebihi batas");
        } else {
            System.out.println("KRS valid");
        }

        sc.close();
    }
}