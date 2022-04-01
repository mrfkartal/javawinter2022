package day13_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {


        String str="Java ile IT cok guzel";

        System.out.println(str.substring(5));  //5.indexi bulacak 5 dahil sonrsa
                                                //heprsini yazdıracak
        System.out.println(str.replace("Java", "mehmet hoca"));
        System.out.println(("mehmet hoca " + str.substring(5)));
        System.out.println(str.substring(9));       //yazılaan index inclusive=dahil

        //eger bşr indexden sona kadar olan parcayı degil
        //belirli bir parcayı almak istersek
        //2 parametre yazmak gerekir str.substring(baslangıcIndexi, bitisIndexi)
        //baslangıc indexi= dahildir/inclusive
        //bitis indexi = exclusive/haric

        System.out.println(str.substring(0,5)); //sıfırıncı index dahil 5 index haric

        System.out.println(str.substring(0,1));  // sadece ilk index yazılır

        System.out.println(str.substring(5,6)); //bana 5.harfi string olarak bulun dersek

        str="java gün geçtikce guzellesıyor";

        System.out.println(str.substring(7,7));  // hiçlik verecek

        //System.out.println(str.substring(5,2));     // bitiş index baslangıc indexinden büyük olamaz
                                                    //HATA VERİR

        System.out.println(str.substring(str.length()-1)); //son harfi verir

        System.out.println(str.substring(str.length()-5));  //son 5 harfi verir

        System.out.println(str.substring(str.length()));  //son harften sonraki kısmı yani HİÇLİK VERİR.


    }
}
