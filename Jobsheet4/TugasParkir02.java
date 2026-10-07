import java.util.Scanner;

public class TugasParkir02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tarifParkir;
        int tarifDasar = 2000;

        System.out.print("Waktu jam parkir: ");
        int waktuParkir = sc.nextInt();

        if (waktuParkir > 2) {
            tarifParkir = tarifDasar + (waktuParkir - 2) * 1000;
            System.out.println("Tarif parkir: "+tarifParkir);
        } else {
            tarifParkir = tarifDasar;
            System.out.println("Tarif parkir: "+tarifParkir);
        }

        sc.close();
    }
}