import ArrayListHashmapHashset.SehirKodu;
import ArrayListHashmapHashset.OgrenciListesi;
import ArrayListHashmapHashset.SinavNotlari;

public class Main {
    public static void main(String[] args) {
        OgrenciListesi ogrenciListesi = new OgrenciListesi();
        ogrenciListesi.ogrenciEkle("Emirhan");
        ogrenciListesi.ogrenciEkle("Claude");
        ogrenciListesi.ogrenciEkle("Chatgpt");

        ogrenciListesi.tumOgrencileriYazdir();
        ogrenciListesi.ogrenciSayisi();

        SinavNotlari sinavNotlari = new SinavNotlari();
        sinavNotlari.notEkle("Emirhan",95);
        sinavNotlari.notEkle("Claude",45);
        sinavNotlari.notEkle("Chatgpt",75);
        sinavNotlari.notGoster("Claude");
        sinavNotlari.tumNotlariYazdir();
        System.out.println("Ortalama Not: " + sinavNotlari.ortalamaNot());

        SehirKodu sehirKodu = new SehirKodu();
        sehirKodu.sehirEkle("İstanbul");
        sehirKodu.sehirEkle("İzmir");
        sehirKodu.sehirEkle("Ankara");
        sehirKodu.sehirSil("İzmir");
        sehirKodu.tumSehirleriYazdir();
        System.out.println("Amasya var mı: " + sehirKodu.sehirVarMi("Amasya"));
    }
}
