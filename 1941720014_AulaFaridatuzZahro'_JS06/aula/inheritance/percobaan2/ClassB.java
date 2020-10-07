package aula.inheritance.percobaan2;

/**
 *
 * @author Aulafz
 */
public class ClassB extends ClassA {

    private int z;

    public void setZ(int z) {
        this.z = z;
    }

    public void getNilaiZ() {
        System.out.println("nilai Z : " + z);
    }

    public void getJumlah() {
        System.out.println("jumlah : " + (super.x + super.y + z));
    }
}
