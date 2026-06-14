package ArrayListHashmapHashset;

import java.util.HashSet;

public class SehirKodu {
    private HashSet<String> sehirler;

    public SehirKodu()
    {
        this.sehirler = new HashSet<>();
    }

    public void sehirEkle(String sehir)
    {
        sehirler.add(sehir);
    }

    public void sehirSil(String sehir)
    {
        sehirler.remove(sehir);
    }

    public boolean sehirVarMi(String sehir)
    {
        if(sehirler.contains(sehir)) {
            return true;
        }
        else {
                return false;
        }
    }

    public void tumSehirleriYazdir()
    {
        for (String sehir : sehirler)
        {
            System.out.println("Şehir Adı: " + sehir);
        }
    }
}
