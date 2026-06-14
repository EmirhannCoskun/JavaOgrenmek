package Extends;

public class Futbolcu {
    private String isim;
    private int numara;
    private double boy;

    //Constructor(Yapıcı Methodlar)
    public Futbolcu(String isim, int numara, double boy) {
        this.isim = isim;
        this.numara = numara;
        this.boy = boy;
    }

    public String getIsim() {
        return isim;
    }

    public int getNumara() {
        return numara;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void bilgiYazdir() //Method
    {
        System.out.println("İsim: " + isim + " Numarası: " + numara + " Boyu:" + boy);
    }

}

