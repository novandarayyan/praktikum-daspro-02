import java.util.Scanner;
public class StudiKasus202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nama mahasiswa : ");
        String namaMahasiswa = sc.nextLine();
        
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenisKegiatan = sc.nextLine();
        
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            
            System.out.print("Jumlah dokumen : ");
            int dokumen = sc.nextInt();
            
            System.out.print("Peringkat juara : ");
            int peringkat = sc.nextInt();
            
            if (peringkat >= 1 && peringkat <= 3) {
                if (dokumen == 4) {
                    System.out.println("Status : Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - dokumen) + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Dana penghargaan tidak diberikan.");
            }
            
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            
            System.out.print("Jumlah dokumen : ");
            int dokumen = sc.nextInt();
            
            System.out.print("Status pendanaan PKM (1=lolos, 0=tidak) : ");
            int statusPendanaan = sc.nextInt();
            
            if (statusPendanaan == 1) {
                if (dokumen == 4) {
                    System.out.println("Status : Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - dokumen) + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Dana penghargaan tidak diberikan.");
            }
            
        } else {
            System.out.println("Status : Dana penghargaan tidak diberikan.");
        }
        
        sc.close();
    }
}