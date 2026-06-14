package Abstract;

public class Araba extends Arac {

    public Araba(String marka, double maxHiz, double suanHiz)
    {
        super(marka,maxHiz,suanHiz);
    }

    @Override
    public void hizlan() {
        System.out.println("Araba Hızlanıyor.");
        setSuanHiz(getSuanHiz() + 50);
    }

    @Override
    public void yavasla() {
        System.out.println("Araba Yavaşlıyor.");
        setSuanHiz(getSuanHiz() - 20);
    }
}
