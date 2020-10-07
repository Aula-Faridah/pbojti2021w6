package aula.inheritance.tugas;

import java.util.Scanner;

/**
 *
 * @author Aulafz
 */
public class MainClass {

    public static void menu() {
        System.out.println("Apakah anda akan menambahkan data?");
    }

    public static void main(String[] args) {
        Scanner aula = new Scanner(System.in);
        String pilih;
        int jmlh = 0;
        do {
            menu();
            System.out.print("Masukkan pilihan anda (Y/T) : ");
            pilih = aula.nextLine();
            switch (pilih) {
                case "Y":
                case "y":
                    jmlh++;

                    System.out.print("Masukkan nip          : ");
                    String nip = aula.nextLine();
                    System.out.print("Masukkan nama pegawai : ");
                    String nm = aula.nextLine();
                    System.out.print("Masukkan jumlah SKS   : ");
                    int sks = aula.nextInt();
                    System.out.print("Masukkan alamat       : ");
                    String almt = aula.next();

                    Dosen d = new Dosen(nip, nm, almt);
                    d.setSKS(sks);
                    DaftarGaji daf = new DaftarGaji();
                    daf.addPegawai(d);
                    System.out.println();
                    daf.printSemuaGaji();
                    break;
                case "T":
                case "t":
                    break;
                default:
                    System.out.println("Pilihan anda tidak tersedia.");
            }
            System.out.println();
        } while (pilih == "Y" || pilih == "T" );

    }
}
