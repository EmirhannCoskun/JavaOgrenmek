package Temeller;

public class tryCatch {
    public static void main(String[] args)
    {
        try
        {
            int[] dizi = {1, 2, 3};
            System.out.println(dizi[5]); // Dizide 5 indexli eleman yok HATA!!!
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Bu indis numaralı eleman bulunamadı.");
        }
        catch (Exception e)
        {
            System.out.println("Genel Hata");
        }
        finally
        {
            System.out.println("catchler çalışada çalışmasada bu çalışacaktır.");
        }

    }
}
