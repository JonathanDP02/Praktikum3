public class kendaraan {
    String nomorPolisi;
    String merk;
    String model;
    int tahunProduksi;

    public kendaraan(String nomorPolisi, String merk, String model, int tahunProduksi){
        this.nomorPolisi = nomorPolisi;
        this.merk = merk;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
    }

    public void cetakinfo(){
        System.out.println("Nomor Polisi   : " + nomorPolisi);
        System.out.println("Merk           : " + merk);
        System.out.println("Model          : " + model);
        System.out.println("Tahun Produksi : " + tahunProduksi);
        System.out.println("----------------------------------");
        System.out.println();
    }
}
