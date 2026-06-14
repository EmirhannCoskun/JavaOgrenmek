package Extends;

public class Oyuncu {
    protected String isim;

    public Oyuncu(String isim)
    {
        this.isim = isim;
    }

    public void oyna(){
        System.out.println(isim + "oynuyor");
    }
}