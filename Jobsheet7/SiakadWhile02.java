import java.util.Scanner; 
public class SiakadWhile02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int jumlahMahasiswa;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = sc.nextInt();

        int i = 0;
        while (i < jumlahMahasiswa) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            int nilai = sc.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid! Masukkan nilai antara 0 - 100.");
                continue;
            }

            String nilaiHuruf;
            if (nilai > 80 && nilai <= 100) {
                nilaiHuruf = "A";
            } else if (nilai > 73 && nilai <= 80) {
                nilaiHuruf = "B+";
            } else if (nilai > 65 && nilai <= 73) {
                nilaiHuruf = "B";
            } else if (nilai > 60 &&1 nilai <= 65) {
                nilaiHuruf = "C+";
            } else if (nilai > 50 && nilai <= 60) {
                nilaiHuruf = "C";
            } else if (nilai > 39 && nilai <= 50) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah " + nilaiHuruf);
            if (nilaiHuruf.equals("A")) {
                System.out.println("Bagus, pertahankan nilainya!");
            }
            i++;
        }

        sc.close();
    }
}
