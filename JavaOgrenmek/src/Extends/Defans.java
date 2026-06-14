package Extends;

public class Defans extends Oyuncu // extends = c# kalıtım
{
    public Defans(String isim){
        super(isim); // c# taki base gibi
    }

    @Override // c# taki override
    public void oyna() {
        System.out.println(isim + "savunuyor");
    }
}
