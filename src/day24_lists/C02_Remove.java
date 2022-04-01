package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<String>();
        isimler.add("Aykut");
        isimler.add("yusuf");
        isimler.add("ilker");
        isimler.add("oguzhan");
        System.out.println(isimler);   //[Aykut, yusuf, ilker, oguzhan]


        //remove (istenenObject) method'u istenen elementi kaldirip
        //bize true/false doner.
        //eger remove isleminin yapildiğini kontrol etmek istiyorsaniz
        //method u boolen bir variable a atayabilirsiniz


        boolean sonuc=isimler.remove("oguzhan");  //cevaplar boolen dönecek
                                                    // true dönecekso

        //sonucu kullanıcıya yazdırmak isterseniz
        //if/else ile istediğiniz değerlendirmeyi yazaibilirsiniz

        sonuc= isimler.remove("berk");
        if (sonuc==true){
            System.out.println("istedğiniz isim silindi");
        }else{
            System.out.println("istedğiniz isim listede olmadığı için silinemedi");
        }

        System.out.println(isimler);   //[Aykut, yusuf, ilker]

        //remove(index) yazdğımızda sildim/silmedim ihtimali kalmaz
        //bize remove edilen elementi döner

        System.out.println(isimler.remove(1));  //yusufu siler
                                                    //delil olarak yusuf ismini bize döndürür

        //yazdırsak ta yazdırmasakta liste değişti ve 1.indexteki elememnt silindi
        System.out.println(isimler);   //[Aykut, ilker]

    }
}
