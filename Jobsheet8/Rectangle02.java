//Parameter Percobaan
//Percobaan 2 (uji tambahan, langkah 9) (baris, kolom) uji ke-1	| (2 + (2 mod 3), 4 + (2 mod 3)) = (4, 6)
//Percobaan 2 (uji tambahan, langkah 9) (baris, kolom) uji ke-2	| (5 + (2 mod 3), 2 + (2 mod 3)) = (7, 4)
//Percobaan 2 (Pertanyaan 2) baris, kolom n	                    | 4 + (2 mod 4), 6 + (2 mod 4) = 6, 8
import java.util.Scanner;
public class Rectangle02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: "); 
        int baris = sc.nextInt(); 
        System.out.print("Masukkan jumlah kolom: "); 
        int kolom = sc.nextInt();

        for (int i = 1; i <= baris; i++) {       
            for (int j = 1; j <= kolom; j++) {   
            System.out.print("#"); 
            } 
            System.out.println();                 
        } 

        sc.close();
    }
}
