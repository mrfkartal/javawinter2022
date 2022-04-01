package day11_stringManupaulations;

import java.util.Scanner;

public class C05_IndexOf {
    public static void main(String[] args) {

        String str1="Java bir baska guzel valla cok guzel";
        //istersek char olarak bir harfin indeksini bize döndürür
        System.out.println(str1.indexOf('j'));  //0
        System.out.println(str1.indexOf("aska"));  //10 aska nın a sının kaçıncı harf olduğunu verir
        //istersek bir harf veya metin olarak verdiğiniz stringin indexini dönüdürür
        System.out.println(str1.indexOf("l"));  //19

        System.out.println(str1.length()-1);   //19

        //ayni harften birden fazla varsa?

        System.out.println(str1.indexOf("a"));  //aynı harften birden fazla varsa buluduğu ilk aynı harfi yazdırır.

        System.out.println(str1.indexOf('b',5));
        //bu method'da java aramaya fromindex olarak yazdıgımız indexten baslar
        //(inclusive)


        //verilen String'deki 2.a harfinin indexini bulalım
        int ilkindex=str1.indexOf('a');   //
        System.out.println(str1.indexOf('a',ilkindex+1));  //


        //20.indexten sonra guzel aratalım
        System.out.println(str1.indexOf("guzel", 20));

        //stringde olmayan bir harf aratsak
        System.out.println(str1.indexOf("y"));   // y yok dmesi lazim ama return typei index
        //yok dmeenin sayısal karsılığı olarak java -1 dondurmeyi tercih etmiştir.

        //kullanicidan mail adresini isteyin @ işareti içermiyorsa geçersiz yazdırın
        //iceriyorsa mailiniz kabul edildi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen mailinizi yazınız");
        String mail=scan.next();
        if (mail.indexOf("@")==(-1)){
            System.out.println("gecersiz email");
        } else {
            System.out.println("mailiniz kabul edildi");
        }

        //ÖZET: İNDEXOF METODU İCİRİSİNE YAZILAN String veya char'ın metinde hangi indexde oldugunu bize döndürür
        //eger aradığımız metin veya char yoksa, olmadığının delili olarak bize -1 dondurur.


    }
}
