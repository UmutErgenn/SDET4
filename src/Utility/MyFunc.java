package Utility;

public class MyFunc {
    public static void Bekle(int saniye){
        try {
            Thread.sleep(saniye*1000);      // thread sleep java'ya ait, programı bekletme komutudur.bu komt sadece debug yaparken kullanılır.
        }                                        // biz selenium'un özel komutlarını kullanacağız,bunu kullanmayacağız.
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
