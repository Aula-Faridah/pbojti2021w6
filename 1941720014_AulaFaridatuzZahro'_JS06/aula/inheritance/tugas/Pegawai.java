package aula.inheritance.tugas;

/**
 *
 * @author Aulafz
 */
public class Pegawai {

    String nip, nama, alamat;

    Pegawai() {
        
    }

    Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public void setNama(String nm) {
        this.nama = nm;
    }

    public String getNama() {
        return this.nama;
    }

    public int getGaji() {
        return 2000000;
    }
}
