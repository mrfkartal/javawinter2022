package day49_maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_ListeyiDuzenliYazdirma {
    public static void main(String[] args) {


        Map<Integer, String> sinif =MapOlustur.myMap();
        System.out.println(sinif);

        siniflistYazdir(sinif);
    }

    public static void siniflistYazdir(Map<Integer, String> sinif) {
        System.out.println("Numara   isim   soyisim    brans");
        System.out.println("=================================");

        // Map yapisinda yazdirdigimizda kullanicilar bir sey anlamayabilir
        // bunun icin once map yapisini kodlarla manipule edip
        // map'deki datalari, istedigimiz formata sokmamiz gerekir
        // 1. adim key ve value'lari map'den alip
        // iki farkli collection uyesine atadik
       Set<Integer> keySet= sinif.keySet();

        Collection<String> valueSet=sinif.values();

        System.out.println(keySet); //[101, 102, 103]
        System.out.println(valueSet); //[ali, can, dev, veli, yan, QA, ali, yan, c*]
        System.out.println(valueSet.size()); //3

        for (String each: valueSet) {
            System.out.println(each);
        }

    }


}
