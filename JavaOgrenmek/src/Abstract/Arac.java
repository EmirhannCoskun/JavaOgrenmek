package Abstract;

public abstract class Arac {
    private String marka;
    private double maxHiz;
    private double suanHiz = 0;

    public Arac(String marka,double maxHiz,double suanHiz){
        this.marka = marka;
        this.maxHiz = maxHiz;
        this.suanHiz = suanHiz;
    }

    public String getMarka() {
        return marka;
    }

    public double getMaxHiz() {
        return maxHiz;
    }

    public double getSuanHiz() {
        return suanHiz;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setMaxHiz(double maxHiz) {
        this.maxHiz = maxHiz;
    }

    public void setSuanHiz(double suanHiz) {
        this.suanHiz = suanHiz;
    }

    public abstract void hizlan();
    public abstract void yavasla();

    public void markaBilgisiYazdir()
    {
        System.out.println("Marka: " + marka + " Max Hız: " + maxHiz);
    }

    public void suanHizGoster(){
        System.out.println("Şu anki hız:" + suanHiz);
    }
}
