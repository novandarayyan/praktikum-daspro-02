import java.util.Scanner;

public class GajiKaryawan02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int gajiPokok;
        double bonus, totalGaji;
        double tunjTransp=600000;
        double tunjMkn=400000;

        gajiPokok=sc.nextInt();
        
        bonus= 0.05*gajiPokok;

        totalGaji=gajiPokok+tunjTransp+tunjMkn+bonus - (0.1*gajiPokok);

        System.out.println("Bonus Bulanan anda adalah Rp." +bonus);
        System.out.println("Gaji yang anda terima adalah Rp." +totalGaji);
        }
    }
