package Interface;

public class Telefon implements IBaslayabilir {
    private String marka;
    private boolean acildiMi;

    public Telefon(String marka) {
        this.marka = marka;
        this.acildiMi = false;  // Başlangıçta kapalı
    }
    @Override
    public void baslat() {
        System.out.println("Telefon açılıyor.");
        acildiMi = true;
    }

    @Override
    public void durdur() {
        System.out.println("Telefon kapanıyor.");
        acildiMi = false;
    }

    @Override
    public boolean calisiyor() {
        return acildiMi;
    }
}
