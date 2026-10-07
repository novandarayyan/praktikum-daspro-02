import java.util.Scanner;
public class PenentuAksesLab02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;

        System.out.print("Apakah anda Mahasiswa Aktif? (true/false): ");
        mahasiswaAktif = sc.nextBoolean();
        System.out.print("Apakah anda sedang disanksi? (true/false): ");
        sedangDisanksi = sc.nextBoolean();
        System.out.print("Apakah anda punya izin dari Dosen? (true/false): ");
        punyaIzinDosen = sc.nextBoolean();
        System.out.print("Apakah anda Asisten Lab? (true/false): ");        
        asistenLab = sc.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses Lab diberikan");
            } else {
                System.out.println("Akses Lab ditolak: Membutuhkan izin dosen atau status sebagai Asisten Lab");
            }
        } else {
            System.out.println("Akses Lab ditolak: status mahasiswa tidak memenuhi syarat");
        }

        sc.close();

    }
}

