package Temeller;

import java.util.Date;

public class KontrolYapilari {
    public static void main(String[] args){

        int not = 55;

        // if-else yapıları

        if(not > 50) {
            System.out.println("Geçti");
        }
        else if(not > 100 || not < 0){
            System.out.println("Geçersiz not");
        }
        else{
            System.out.println("Kaldı");
        }

        // for yapısı
        for(int i = 0;i<=5;i++)
        {
            System.out.println( + i);
        }

        //While

        int sayac = 0;
        while (sayac < 3)
        {
            System.out.println("Döngü no:" + sayac);
            sayac++;
        }

        //Switch

        int gun = 3;
        switch(gun)
        {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            default:
                System.out.println("Diğer günler");

        }


    }
}
