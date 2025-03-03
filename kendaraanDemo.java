import java.util.Scanner;

public class kendaraanDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah kendaraan : ");
        int jml = sc.nextInt();
        sc.nextLine();

        kendaraan [] arrayOfKdrn = new kendaraan[jml];
        for(int i = 0; i < jml; i++){
            System.out.println("Masukkan Data Kendaraan ke-" + (i+1));
            System.out.print("Nomor Polisi   : ");
            String nomorPolisi = sc.nextLine();
            System.out.print("Merk           : ");
            String merk = sc.nextLine();
            System.out.print("Model          : ");
            String model = sc.nextLine();
            System.out.print("Tahun Produksi : ");
            int tahunProduksi = sc.nextInt();
            sc.nextLine();

            if(tahunProduksi < 1990 || tahunProduksi > 2025){
                System.out.println("Tahun Produksi Tidak Valid!!!");
                i--;
            }else{
                arrayOfKdrn[i] = new kendaraan(nomorPolisi, merk, model, tahunProduksi);
            }continue;
        }
        
        for(int i = 0; i < jml; i++){
            arrayOfKdrn[i].cetakinfo();
        }
    }
}
