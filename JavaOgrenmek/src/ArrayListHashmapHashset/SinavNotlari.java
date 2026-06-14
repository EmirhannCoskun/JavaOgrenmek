package ArrayListHashmapHashset;

import java.util.HashMap;

public class SinavNotlari {
    private HashMap<String,Integer> notlar;

    public SinavNotlari()
    {
        this.notlar = new HashMap<>();
    }

    public void notEkle(String ogrenciAdi, int not)
    {
           notlar.put(ogrenciAdi,not);
    }

    public void notGoster(String ogrenciAdi)
    {
        if(notlar.containsKey(ogrenciAdi)) {
            System.out.println(ogrenciAdi + "ın Notu: " + notlar.get(ogrenciAdi));
        } else {
            System.out.println("Öğrenci bulunamadı");
        }
    }

    public double ortalamaNot()
    {
        double ortalama = 0;
        for(int not : notlar.values()){
            ortalama+=not;
        }
        ortalama = ortalama/notlar.size();
        return ortalama;
    }

    public void tumNotlariYazdir()
    {
        for(String ad : notlar.keySet())
        {
            System.out.println(ad + ": " + notlar.get(ad));
        }
    }
}
