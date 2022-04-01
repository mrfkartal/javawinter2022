package day11_stringManupaulations;

import java.util.Locale;

public class C01_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str="Java Güzeldir";

        //bız string methodlarını arka arkaya kullanabiliriz
        //mesela ikinci kelimenin ilk harfini kucuk olarak yazdıralım

       // str.charAt(5); //böyle yazdığımızda sonuc artik String değil char olacaktir.
        // dolayısıyla String'de yapmak istediğimiz tüm değişiklikleri
        //once yapip sonra charAt() methodunu kullanmalıyız

        System.out.println(str.toLowerCase().charAt(5));
        System.out.println(str.toUpperCase(Locale.forLanguageTag("TR")));

        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));
    }
}
