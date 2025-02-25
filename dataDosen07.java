public class dataDosen07 {
    static void dataSemuaDosen(dosen07 [] arrayOfDosen){
        System.out.println("=== Data Semua Dosen ===");
        for (dosen07 d : arrayOfDosen){
            d.cetakInfo();
        }
    }

    static void jenisKel(dosen07 [] arrayOfDosen){
        int pria = 0, wanita = 0;

        for (dosen07 d : arrayOfDosen){
            if (d.jenisKelamin) 
            pria++;
            else wanita++;
        }
        System.out.println("Jumlah Dosen Laki-laki: " + pria);
        System.out.println("Jumlah Dosen Perempuan:  " + wanita);
    }

    static void rataRata(dosen07 [] arrayOfDosen){
        int totalPria = 0, totalWanita = 0, pria = 0, wanita = 0;
        for (dosen07 d : arrayOfDosen){
            if (d.jenisKelamin){
                totalPria += d.usia;
                pria++;
            } else {
                totalWanita +=  d.usia;
                wanita++;
            }    
        } 
        double rataPria;
        if (pria > 0) {
            rataPria = (double) totalPria / pria;
        } else {
            rataPria = 0;
        }

        double rataWanita;
        if (wanita > 0) {
            rataWanita = (double) totalWanita / wanita;
        } else {
            rataWanita = 0;
        }

        System.out.println("Rata-rata Usia Dosen Laki-laki: " + rataPria);
        System.out.println("Rata-rata Usia Dosen Perempuan: " + rataWanita);
    }

    static void tua(dosen07 [] arrayOfDosen){
        dosen07 tertua = arrayOfDosen[0];
        for (dosen07 d : arrayOfDosen){
            if (d.usia > tertua.usia)
            tertua = d;
        }
        System.out.println("=== Dosen Paling Tua ===");
        tertua.cetakInfo();
    }

    static void muda(dosen07 [] arrayOfDosen){
        dosen07 termuda = arrayOfDosen[0];
        for (dosen07 d : arrayOfDosen){
            if (d.usia < termuda.usia)
            termuda = d;
        }
        System.out.println("=== Dosen Paling Muda ===");
        termuda.cetakInfo();
    }
}
