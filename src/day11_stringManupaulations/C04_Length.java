package day11_stringManupaulations;

import java.util.Locale;
import java.util.Scanner;

public class C04_Length {
    public static void main(String[] args) {

        //kullanıcıdan ismini alıp basharfini ve son harfini büyük harflerle yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen isminizi yazınız");

        String isim = scan.nextLine();

        System.out.println("ilk harf :" + isim.toUpperCase(Locale.forLanguageTag
                ("TR")).charAt(0));
        System.out.println("ilk harf :" + isim.toUpperCase(Locale.forLanguageTag
                ("TR")).charAt(isim.length() - 1));


        String str1 = "";
        System.out.println(str1.length());  //0

        String str2=null;

        System.out.println(str2.length());   //çalıştığında hata verir

        String str3;
        //System.out.println(str3);
        //str3 ile str2 ye deger atanmamıştır
        //str2 null pointer ile işaretlendiğiniden java durumun kontrol
        //altinda olduğunu bilir
        //ve geriye kalan kodun calısmasına engel olmaz
        //ancak str3 e bir deger atamasi olmayınca java altını kırmızı çizer
        //ve bu durum düzeltilinceeye kadar kodun geriye kalalnun calısmasına izin vermez
    }
}