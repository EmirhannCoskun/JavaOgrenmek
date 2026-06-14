package Abstract;

public class YolcuGemisi extends Gemi{

    public YolcuGemisi(String ad,double yuksekligi,int yolcuKapasitesi)
    {
        super(ad, yuksekligi, yolcuKapasitesi);
    }

    @Override
    public void denizeAc() {
        System.out.println("Yolcu gemisi denize açılıyor.");
    }

    @Override
    public void liman() {
        System.out.println("Yolcu gemisi limana yanaşıyor.");
    }
}
