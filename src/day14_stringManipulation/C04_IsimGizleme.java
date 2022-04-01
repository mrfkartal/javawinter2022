package day14_stringManipulation;

import java.util.Locale;

public class C04_IsimGizleme {
    public static void main(String[] args) {
        //Soru 7) Kullanicidan ismini, soyismini ve kredi
        // karti bilgisini isteyin ve asagidaki gibi yazdirin
        //isim-soyisim : M***** B*******
        //kart no : **** **** **** 1234

        String isim="omer";
        String soyisim="kartal";
        String kKNo="1234567890123456";

        String yeniIsım=isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S","*");

        String yeniSoyisim=soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\S","*");

        String yenikKNo="**** **** ****" + kKNo.substring(12);
        System.out.println("isim  soyisim: "+yeniIsım+" " +yeniSoyisim+"\n+yenikKNo :"+yenikKNo);


    }
}
