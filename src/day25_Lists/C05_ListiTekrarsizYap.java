package day25_Lists;

import java.util.ArrayList;
import java.util.List;

import static day25_Lists.C04_ListedenTekrarlıElementleriSilme.tekrarsizListeOlustur;

public class C05_ListiTekrarsizYap {
    public static void main(String[] args) {

        //verilen bir listede tekrar eden sayilari sadece 1 tane yapan
        //bir method olusturun
        //orn:[1,3,5,3,5,6,1,7] bu listi
        //yeniList : [1,3,5,6,7] bu hale dönüştürün

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        tekrarsizListeOlustur(sayilar);

    }
}
