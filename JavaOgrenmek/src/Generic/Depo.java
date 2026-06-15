package Generic;

import java.util.ArrayList;

public class Depo<T> {
    private ArrayList<T> depo;

    public Depo()
    {
        this.depo = new ArrayList<>();
    }

    public void ekle(T eleman)
    {
        depo.add(eleman);
    }

    public void cikart(T eleman)
    {
        depo.remove(eleman);
    }

    public  void tumElemanlariYazdir()
    {
        for(T eleman : depo)
        {
            System.out.println(eleman);
        }
    }

    public void boyut()
    {
        System.out.println(depo.size());
    }
}
