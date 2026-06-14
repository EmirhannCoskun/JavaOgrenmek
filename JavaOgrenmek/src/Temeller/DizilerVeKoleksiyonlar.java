package Temeller;

import java.util.ArrayList;

public class DizilerVeKoleksiyonlar {
    public static void main(String[] args)
    {
        //Arrays(Diziler)
        int[] sayilar = {3,15,55,24,10};
        System.out.println(sayilar[0]);

        //ArrayList (Listeler)
        ArrayList<String> isimler = new ArrayList<>();
        isimler.add("Emirhan");
        isimler.add("Beyza");
        isimler.add("Ezgi");
        isimler.add("Onur");

        System.out.println(isimler.get(0)); // Emirhan'ı getirir.
        System.out.println(isimler.size()); // 4

        //Foreach

        for(String isim : isimler)
        {
            System.out.println(isim);
        }
    }
}
