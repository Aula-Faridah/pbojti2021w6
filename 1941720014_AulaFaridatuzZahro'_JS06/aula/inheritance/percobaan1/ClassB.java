package aula.inheritance.percobaan1;

/**
 *
 * @author Aulafz
 */
public class ClassB extends ClassA{

    public int z;

    public void getNilaiZ() {
        System.out.println("nilai Z : " + z);
    }

    public void getJumlah() {
        System.out.println("jumlah : " + (super.x + super.y + z));
    }

}
