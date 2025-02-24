import java.util.Scanner;

public class mataKuliahDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        mataKuliah07[] arrayOfMataKuliah = new mataKuliah07[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for(int i = 0; i < 3; i++){
            arrayOfMataKuliah[i] = new mataKuliah07();
            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("KODE    : ");
            arrayOfMataKuliah[i].kode = sc.nextLine();

            System.out.print("NAMA    : ");
            arrayOfMataKuliah[i].nama = sc.nextLine();

            System.out.print("SKS     : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);

            System.out.print("JUMLAH JAM: ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("---------------------------------------");

            arrayOfMataKuliah[i] = new mataKuliah("4567","DASPRO", 4,5);
        }
    }
}
