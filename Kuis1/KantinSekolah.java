import java.util.Scanner;

public class KantinSekolah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int porsiNasicampur;
        int hargaNasicampur=8500;
        int modalSehari=1201250;
        int labaKotor;

        System.out.println("Jumlah nasi campur terjual: ");
        porsiNasicampur = sc.nextInt();

        labaKotor = porsiNasicampur * hargaNasicampur;

        System.out.println("Laba Kotorrr" +labaKotor);
        }



    }
}