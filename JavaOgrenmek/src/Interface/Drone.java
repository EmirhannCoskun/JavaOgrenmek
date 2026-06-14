package Interface;

public class Drone implements IHareket,IBaslayabilir{
    private String model;
    private boolean havaVarMi;
    private boolean acildiMi;
    public Drone(String model,boolean havaVarMi)
    {
        this.model = model;
        this.havaVarMi = havaVarMi;
    }
    @Override
    public void baslat() {
        System.out.println("Drone açılıyor.");
        acildiMi = true;
    }

    @Override
    public void durdur() {
        System.out.println("Drone kapanıyor.");
        acildiMi = false;
    }

    @Override
    public boolean calisiyor() {
        return acildiMi;
    }

    @Override
    public void ileriGit() {
        System.out.println("İleri gidiyor.");
    }

    @Override
    public void geriyeGit() {
        System.out.println("Geri gidiyor.");
    }

    @Override
    public void sagaDon() {
        System.out.println("Sağa dönüyor.");
    }

    @Override
    public void solaDon() {
        System.out.println("Sola dönüyor.");
    }

    @Override
    public void dur() {
        System.out.println("Duruyor.");
    }
}
