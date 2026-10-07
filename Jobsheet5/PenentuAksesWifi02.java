import java.util.Scanner;
public class PenentuAksesWifi02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean mahasiswa;
        boolean dosen;
        boolean akunDiblokir;

        System.out.print("Apakah anda Mahasiswa? (true/false): ");
        mahasiswa = sc.nextBoolean();
        System.out.print("Apakah anda Dosen? (true/false): ");
        dosen = sc.nextBoolean();
        System.out.print("Apakah akun anda terblokir? (true/false): ");
        akunDiblokir = sc.nextBoolean();

        if ((mahasiswa || dosen) && !akunDiblokir) {
            System.out.println("Akses Wifi diberikan");
        } else {
            System.out.println("Akses Wifi ditolak");
        }
    }
}


