package day12_stringManipulation;

public class C05_RePlace {
    public static void main(String[] args) {

        String str="bugun ne çok şey ogrendik";

        //bu cumledeki bosluk dısındaki karakter sayısını bulunuz
        System.out.println("space haric karakter sayiısı" +str.replace(" ", "").length());
        //atama yapilmadığı sürece orjinal string kalici olarak degismez
        //sadece satir icin degisiklik yapılıp sonuc yazdırılmıs olur.
        System.out.println("orjinal str karakter sayısı:" +str.length());

        // str da kalici değisiklik yapalım
        //bugun yerine yarın yazdıralım
        //ogrendik yerine ogreneceğiz yazalım
        //eger cümle tamamen değiştirmel istiyorsak atama yapmamız lazım..**EĞER ATAMA YOKSA KALICI
        //DEĞİŞİKLİKTE YOKTUR.

        str=str.replaceAll("bugun", "Yarın");
        str=str.replaceFirst("ogrendik","ogrenecegız");
        System.out.println("kalıcı degisiklikten sonra :" + str);
        str.replace("ne çok","ne az");
        System.out.println(str);

    }
}
