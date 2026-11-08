//Percobaan 3 (uji awal, langkah 3)	| 2 + (2 mod 3) = 4
import java.util.Scanner;
public class Triangle02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = "); 
        int n = sc.nextInt(); 
        int i = 0; 
        while (i <= n) { 
            int j = 0; 
            while (j < i) { 
                System.out.print("*"); 
                j++; 
            } 
            i++; 
        } 
        sc.close();
    }
}
