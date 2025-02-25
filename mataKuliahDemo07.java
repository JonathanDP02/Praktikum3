import java.util.Scanner;

public class mataKuliahDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah matakuliah: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        mataKuliah07[] arrayOfMataKuliah = new mataKuliah07[jumlah];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for(int i = 0; i < jumlah; i++){
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));

            arrayOfMataKuliah[i] = new mataKuliah07();
            arrayOfMataKuliah[i].tambahData();

            // System.out.print("KODE    : ");
            // kode = sc.nextLine();

            // System.out.print("NAMA    : ");
            // nama = sc.nextLine();

            // System.out.print("SKS     : ");
            // dummy = sc.nextLine();
            // sks = Integer.parseInt(dummy);

            // System.out.print("JUMLAH JAM: ");
            // dummy = sc.nextLine();
            // jumlahJam = Integer.parseInt(dummy);
            System.out.println("---------------------------------------");

            // arrayOfMataKuliah[i] = new mataKuliah07(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < jumlah; i++){
            System.out.println("Data Matakuliah ke-" + (i+1));
            arrayOfMataKuliah[i].cetakInfo();
            // System.out.println("KODE        : " + arrayOfMataKuliah[i].kode);
            // System.out.println("NAMA        : " + arrayOfMataKuliah[i].nama);
            // System.out.println("SKS         : " + arrayOfMataKuliah[i].sks);
            // System.out.println("JUMLAH JAM  : " + arrayOfMataKuliah[i].jumlahJam);
            // System.out.println("---------------------------------------");

        }
    }
}
