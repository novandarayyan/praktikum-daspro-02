import java.util.Scanner;
public class NestedUjianSkripsi02 {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String pesan;
    System.out.print("Apakah Mahasiswa sudah bebas kompen?: ");
    String bebasKompen = sc.nextLine().trim();

    System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
    int bimbinganP1 = sc.nextInt();
    System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
    int bimbinganP2 = sc.nextInt();

    if (bebasKompen.equalsIgnoreCase("ya")){
        if (bimbinganP1 >= 8 && bimbinganP2 >= 4){
            pesan = "Semua syarat terpenuhi, Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4){
            pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            } else if (bimbinganP1 < 8){
            pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali";
            } else {
            pesan = "Gagal! Log bimbingan P2 kurang dari 4 kali";
            }
    } else {
        pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
}

System.out.println(pesan);
}
}