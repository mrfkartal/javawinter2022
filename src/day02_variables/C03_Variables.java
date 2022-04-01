package day02_variables;

public class C03_Variables {
    public static void main(String[] args) {

        String ogrenciIsmi="Melih";

        ogrenciIsmi="Furkan";

        //bir variable declare edildikten  sonra istediğimiz kadar deger degisimi yapabiliriz
        //ancak declare edilen variable tekrar declare edilemez

        //String ogrenciIsmi="Abdullah";

        String isim,soyisim,dogumyeri;

        isim="Ömer";
        soyisim="kartal";
        dogumyeri="Ankara";

        System.out.println(dogumyeri);
        System.out.println(isim);

        int level=5, yas=22, maas=4000;
        System.out.println(yas);

        String tcNO="12345678901";
        String hiclik="";

        //String non-primitive oldugu icin biz sadece data saklamak degil
        //ekstra bazi özellikleri de kullanabiliyoruz
        //Eger tc no okul numarası veya tel numarası gibi
        //kendisi sayisal olan ancak matematiksel bir islemde kullanılmayan
        //degerler icinde String Kullanılabilir


        String harf="A";
        char harf2= 'A';

        // bu ikisi icinde aynı durum gecerli
        //ben A harfi icinde bir variable i char olarak da olusturabilirim String olarak da olusturabilirim
        //eger sadece saklayacak char kullanılabilir ama
        //stringin özelliklerinden istifade etmek icin string olarak tanımlamak daha avantajli olabilir


        //primitive ler kçük harfler ile başlarlar ve sadece bilgi depolarlar
        //non-primitive ler genelde büyük harfler başlar class isimleridir
        // ve sadece value taşımaz
        // aynı zamanda value ile ilgili bircok bilgi verirler

        //primitiveleri java oluşturur biz data turu  oluşturamayız
        // non primitivelere hem java hem biz data tuuru olururuuruz
    }
}
