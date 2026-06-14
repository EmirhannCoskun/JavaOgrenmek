package Abstract;

public class Bisiklet extends Arac{

    public Bisiklet(String marka,double maxHiz,double suanHiz)
    {
        super(marka, maxHiz, suanHiz);
    }
    @Override
    public void hizlan() {
        System.out.println("Bisiklet pedal çeviriyor.");
    }

    @Override
    public void yavasla() {
        System.out.println("Bisiklet fren yapıyor.");
    }
}
