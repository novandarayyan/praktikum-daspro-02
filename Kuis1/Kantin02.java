import java.util.Scanner;

public class Kantin02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int porsiNasicampur;
        int hargaNasicampur=8500;
        int modalSehari=1201250;
        int labaKotor;
        int labaBersih;
        int bagianPetugas;
        int sisaKas;

        System.out.println("Jumlah nasi campur terjual: ");
        porsiNasicampur = sc.nextInt();

        labaKotor = porsiNasicampur * hargaNasicampur;
        labaBersih = modalSehari - labaKotor;
        bagianPetugas = labaBersih / 4;
        sisaKas = labaBersih % 4;


        System.out.println("Pendapatan: Rp. " +labaKotor);
        System.out.println("Laba: Rp. " +labaBersih);
        System.out.println("Bagian Petugas: Rp. " +bagianPetugas);
        System.out.println("Sisa kas: Rp. " +sisaKas);
        //Output masing-masing, dengan contoh 100 porsi Nasi Campur terjual: 
        //Pendapatan yaitu hasil total keuntugan dari Nasi Campur. Contoh 100 porsi memberikan Rp.850000
        //Laba yaitu hasil pendapatan dikurangi modal. Contoh memberikan Rp. 351250
        //Bagian Petugas yaitu Laba dibagi keempat tiap petugas. Contoh memberikan Rp. 87812 per orang.
        //Sisa kas yaitu sisa laba yang tidak dibagi ke petugas. Contoh memberikan Rp. 2 sadge :((((
        //Output dari program dengan input 100 porsi: 
        //Jumlah nasi campur terjual: 
        //100
        //Pendapatan: Rp. 850000
        //Laba: Rp. 351250
        //Bagian Petugas: Rp. 87812
        //Sisa kas: Rp. 2
        }



    }
