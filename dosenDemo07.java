// dosenDemo07.java
import java.util.Scanner;

public class dosenDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jmlDosen = sc.nextInt();
        sc.nextLine();

        dosen07[] daftarDosen = new dosen07[jmlDosen];

        for (int i = 0; i < jmlDosen; i++) {
            System.out.println("\nMasukkan data dosen ke-" + (i + 1));

            System.out.print("KODE               : ");
            String kode = sc.nextLine();

            System.out.print("NAMA               : ");
            String nama = sc.nextLine();

            System.out.print("JENIS KELAMIN (L/P): ");
            char jk = sc.nextLine().toUpperCase().charAt(0);
            Boolean jenisKelamin = (jk == 'L');

            System.out.print("USIA               : ");
            int usia = sc.nextInt();
            sc.nextLine();

            System.out.println("------------------------");

            daftarDosen[i] = new dosen07(kode, nama, jenisKelamin, usia);
        }

       
        dataDosen07.dataSemuaDosen(daftarDosen);
        dataDosen07.jenisKel(daftarDosen);
        dataDosen07.rataRata(daftarDosen);
        dataDosen07.tua(daftarDosen);
        dataDosen07.muda(daftarDosen);
    }
}

