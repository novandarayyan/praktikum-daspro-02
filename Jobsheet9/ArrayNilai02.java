import java.util.Scanner;

public class ArrayNilai02 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; 1 < nilaiAkhir.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[1] = input.nextInt();
        }

        

    }
}
