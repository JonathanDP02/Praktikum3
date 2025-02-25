import java.util.Scanner;

public class mataKuliah07 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public mataKuliah07(String kode, String nama, int sks, int jumlahJam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public mataKuliah07(){}

    void tambahData(){
        Scanner sc = new Scanner(System.in);

        System.out.print("KODE    : ");
        this.kode = sc.nextLine();

        System.out.print("NAMA    : ");
        this.nama = sc.nextLine();

        System.out.print("SKS     : ");
        this.sks = Integer.parseInt(sc.nextLine());

        System.out.print("JUMLAH JAM: ");
        this.jumlahJam = Integer.parseInt(sc.nextLine());
    }

    void cetakInfo(){
        System.out.println("KODE      : " + this.kode);
        System.out.println("NAMA      : " + this.nama);
        System.out.println("SKS       : " + this.sks);
        System.out.println("JUMLAH JAM: " + this.jumlahJam);
        System.out.println("--------------------------------");
    }
}
