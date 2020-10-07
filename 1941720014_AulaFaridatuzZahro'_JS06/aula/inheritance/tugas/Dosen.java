package aula.inheritance.tugas;

/**
 *
 * @author Aulafz
 */
public class Dosen extends Pegawai {

    int jumlahSKS, TARIF_SKS = 100000;

    Dosen() {

    }

    Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setSKS(int sks) {
        this.jumlahSKS = sks;
    }

    /**
     *
     * @return
     */
    @Override
    public int getGaji() {
        int total = (jumlahSKS * TARIF_SKS);
        return total + super.getGaji();
    }
}
