package Abstract;

public abstract class Gemi {
    private String ad;
    private double yuksekligi;
    private int yolcuKapasitesi;

    public Gemi(String ad,double yuksekligi,int yolcuKapasitesi)
    {
        this.ad = ad;
        this.yuksekligi = yuksekligi;
        this.yolcuKapasitesi = yolcuKapasitesi;
    }

    public abstract void denizeAc();
    public abstract void liman();

    public void gemiBilgisiYazdir()
    {
        System.out.println("Gemi Adı: " + ad + " Yükseklik: " + yuksekligi + " Yolcu Kapasitesi: " + yolcuKapasitesi);
    }

    public void aciliBilgisiGoster()
    {
        System.out.println("Yükseklik: " + yuksekligi);
    }

}
