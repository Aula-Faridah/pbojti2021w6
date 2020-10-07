package aula.inheritance.tugas;

/**
 *
 * @author Aulafz
 */
public class DaftarGaji {

    public Pegawai[] listPegawai;
    int jumlah = 0;

    public DaftarGaji() {
        listPegawai = new Pegawai[jumlah + 1];
    }

    public void addPegawai(Pegawai p) {
        listPegawai[jumlah] = p;
        jumlah++;
    }

    public void printSemuaGaji() {
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nama    : " + listPegawai[i].getNama());
            System.out.println("Gaji    : " + listPegawai[i].getGaji());
            System.out.println();
        }
    }
}
