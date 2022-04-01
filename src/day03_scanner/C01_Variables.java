package day03_scanner;

public class C01_Variables {
    public static void main(String[] args) {


       //1 farklı 3 data türünde variable olusturun ve bunları yazdırın

        String okulIsmi="Yıldız Koleji";
        System.out.println(okulIsmi);

        char ilkHarf;
        ilkHarf='k';
        System.out.println(ilkHarf); //k

        int sayi1=10, sayi2=20;
        System.out.println(sayi1+sayi2);//30


        //2 isim ve soyisim için 2 variable olusturun ve bunları
        //isminiz : Mehmet
        //soyisminiz : Bulutluöz
        //seklinde yazdırın

        String isim= "Ömer";
        String soyIsim="Kartal";
        System.out.println("İsminiz:"+isim );
        System.out.println("soyIsim:"+soyIsim);

        //3-iki farklı tam sayı data türünde 2 variable olusturun bunların toplamını yazdırın

        short sayi3=20;
        double sayi4=30; //primitive küsürlü sayıları gösteren double datası 50.0 olacak.
        System.out.println("iki sayının toplamı:" + (sayi3 + sayi4)); //50

        //4-bir tam sayı ve bir ondalıklı sayı olusturun ve bunları çarpın

        short sayi5=23234;
        double sayi6=2023.12313;
        System.out.println("iki sayının çarpımı :" + (sayi5*sayi6));

        //5-char data türünde bir variable oluşturun ve yazdırın

        char ozelKarakter='&';
        System.out.println(ozelKarakter);

        //6-bir tamsayi bir de char degisken olusturun ve bunların toplamini yazdırın.

        int sayi7=20;
        char harf='a';
        System.out.println("ifadelerin toplamı :"+ (sayi7 + harf) ); //117

        //char data türümdeki değişkenler matametiksel islemlerde kullanılabilirsa
        //O char değerinin ASCII karşılığını gelir ascii table listesindeki değeri alır

        int sayi8='b';
        System.out.println(sayi8);

    }
}
