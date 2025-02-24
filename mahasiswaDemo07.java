import java.util.Scanner;
import java.lang.NumberFormatException;

public class mahasiswaDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mahasiswa07 [] arrayOtMahasiswa = new mahasiswa07[3];
        String dummy;

        mahasiswa07 [] myArrayOfMahasiswa = new mahasiswa07[3];
        myArrayOfMahasiswa[0].nim = "244107060033";
        myArrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
        myArrayOfMahasiswa[0].kelas = "SIB-1E";
        myArrayOfMahasiswa[0].ipk =(float) 3.75;

        for (int i = 0; i < 3; i++){
            arrayOtMahasiswa[i] = new mahasiswa07();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM     : ");
            arrayOtMahasiswa[i].nim = sc.nextLine();

            System.out.print("NAMA    : ");
            arrayOtMahasiswa[i].nama = sc.nextLine();

            System.out.print("KELAS   : ");
            arrayOtMahasiswa[i].kelas = sc.nextLine();

            System.out.print("IPK     : ");
            arrayOtMahasiswa[i].ipk = Float.parseFloat( dummy = sc.nextLine());
            System.out.println("---------------------------------------");
        }

        for (int i = 0; i<3; i++){
            System.out.println("Mahasiswa ke-" + (i+1));
            arrayOtMahasiswa[i].cetakInfo();
        }

        // for (int i = 0; i < 3; i++){
        //     System.out.println("Data Mahasiswa ke-" + (1+i));
        //     System.out.println("NIM     : " + arrayOtMahasiswa[i].nim);
        //     System.out.println("NAMA    : " + arrayOtMahasiswa[i].nama);
        //     System.out.println("KELAS   : " + arrayOtMahasiswa[i].kelas);
        //     System.out.println("IPK     : " + arrayOtMahasiswa[i].ipk);
        //     System.out.println("---------------------------------------");
        // }
        // arrayOtMahasiswa[0] = new mahasiswa07();
        // arrayOtMahasiswa[0].nim = "244107060033";
        // arrayOtMahasiswa[0].nama = "AGNES TITANIA KINANTI";
        // arrayOtMahasiswa[0].kelas = "SIB - 1E";
        // arrayOtMahasiswa[0].ipk = (float) 3.75;

        // arrayOtMahasiswa[1] = new mahasiswa07();
        // arrayOtMahasiswa[1].nim = "2341720172";
        // arrayOtMahasiswa[1].nama = "aCHMAD MAULANA HAMZAH";
        // arrayOtMahasiswa[1].kelas = "TI - 2A";
        // arrayOtMahasiswa[1].ipk = (float) 3.36;

        // arrayOtMahasiswa[2] = new mahasiswa07();
        // arrayOtMahasiswa[2].nim = "244107023006";
        // arrayOtMahasiswa[2].nama = "DIRHAMAWAN PUTRANTO";
        // arrayOtMahasiswa[2].kelas = "TI - 2E";
        // arrayOtMahasiswa[2].ipk = (float) 3.80;

        // System.out.println("NIM     : " + arrayOtMahasiswa[0].nim);
        // System.out.println("NAMA    : " + arrayOtMahasiswa[0].nama);
        // System.out.println("KELAS   : " + arrayOtMahasiswa[0].kelas);
        // System.out.println("IPK     : " + arrayOtMahasiswa[0].ipk);
        // System.out.println("---------------------------------------");

        // System.out.println("NIM     : " + arrayOtMahasiswa[1].nim);
        // System.out.println("NAMA    : " + arrayOtMahasiswa[1].nama);
        // System.out.println("KELAS   : " + arrayOtMahasiswa[1].kelas);
        // System.out.println("IPK     : " + arrayOtMahasiswa[1].ipk);
        // System.out.println("---------------------------------------");
    
        // System.out.println("NIM     : " + arrayOtMahasiswa[2].nim);
        // System.out.println("NAMA    : " + arrayOtMahasiswa[2].nama);
        // System.out.println("KELAS   : " + arrayOtMahasiswa[2].kelas);
        // System.out.println("IPK     : " + arrayOtMahasiswa[2].ipk);
        // System.out.println("---------------------------------------");

        

    }
}
