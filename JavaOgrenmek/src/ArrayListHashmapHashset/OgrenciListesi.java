package ArrayListHashmapHashset;

import java.util.ArrayList;

public class OgrenciListesi {
    private ArrayList<String> ogrenciler;

    public OgrenciListesi() {
        this.ogrenciler = new ArrayList<>();
    }

    public void ogrenciEkle(String ad) {
        ogrenciler.add(ad);
    }

    public void ogrenciSil(String ad) {
        ogrenciler.remove(ad);
    }

    public void tumOgrencileriYazdir() {
        for (String ogrenci : ogrenciler) {
            System.out.println("Öğrenci Adı: " + ogrenci);
        }
    }

    public void ogrenciSayisi()
    {
        System.out.println(ogrenciler.size());
    }
}
