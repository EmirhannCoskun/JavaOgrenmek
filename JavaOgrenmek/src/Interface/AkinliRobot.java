package Interface;

public class AkinliRobot implements IEnerji{
    private String ad;
    private double batarya;

    public AkinliRobot(String ad,double batarya)
    {
        this.ad = ad;
        if(batarya<0 || batarya > 100)
        {
            System.out.println("Batarya seviyesi 0-100 aralığında olmalıdır.");
        }
        else {
            this.batarya = batarya;
        }
    }

    @Override
    public double bataryaLevel() {

        return batarya;
    }

    @Override
    public void bataryaKontrol() {
        if(batarya<20){
            System.out.println("Batarya düşük.");
        }
        else {
            System.out.println("Batarya yeterli.");
        }
    }

    @Override
    public void enerjiBugunu(double enerji) {
        batarya -= enerji;
    }
}
