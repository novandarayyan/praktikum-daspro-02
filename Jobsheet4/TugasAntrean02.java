import java.util.Scanner;

public class TugasAntrean02 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kode layanan akademik (1-4): ");
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Legalisir Ijazah\nLoket A");
                break;
            case 2:
                System.out.println("Surat Keterangan Aktif Kuliah\nLoket B");
                break;
            case 3:
                System.out.println("Pembayaran UKT\nLoket C");
                break;
            case 4:
                System.out.println("Pengajuan Cuti Akademik\nLoket D");
                break;
            default:
                System.out.println("Kode layanan tidak valid");
                break;
        }
    }  
}         