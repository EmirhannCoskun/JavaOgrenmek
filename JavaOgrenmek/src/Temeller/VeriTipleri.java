package Temeller;

public class VeriTipleri {
    public static void main(String[] args){
        // Veri Tipleri:

        int tamSayi = 10;
        double ondalikSayi = 4.5;
        boolean senMisin = true;
        char ilkHarf = 'a';

        final int sabitDeger = 100; //Sabit değer değiştirilemez.


        /*
        String isim = "Emirhan";
        System.out.println("Merhaba" + isim + "!");

         */

        // Print Methodları

        String metin = "Merhaba Java!";
        System.out.println(metin.length()); // metnin karakter sayısını verir.
        System.out.println(metin.toUpperCase()); // MERHABA JAVA!
        System.out.println(metin.toLowerCase()); // merhaba java!
        System.out.println(metin.substring(0,4)); //İndex numarasına göre çıktı verme
        System.out.println(metin.replace("Java" , "Python"));

        // String formatting (String interpollion)

        String ad = "Emirhan";
        int yas = 16;
        System.out.println(String.format("Adım:%s, Yaşım:%d", ad, yas));
        //veya
        System.out.println("Adım:" + ad + ", Yaşım:" + yas);

    }

}
