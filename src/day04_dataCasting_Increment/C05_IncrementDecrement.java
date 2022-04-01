package day04_dataCasting_Increment;

public class C05_IncrementDecrement {
    public static void main(String[] args) {
        int sayi=20;
        System.out.println(sayi+10);  //30
        //bu satırda sayıyı 10 arttımadım
        //sayının 10 fazlasını yazdırdım

        System.out.println(sayi);  //20

        //eger atama yapmazsak sayıda yaptıgımız artıma veya azaltma kalıcı olmaz

        sayi=sayi+10;
        System.out.println(sayi);
        System.out.println(sayi=sayi+=10);
        System.out.println(sayi);

        System.out.println(sayi+=10);
        System.out.println(sayi);

        //BİR VARİABLE IN DEGERİNİ

        System.out.println("24.satir : " + sayi++); //50
        System.out.println("25.satir : " + sayi);  //51

        System.out.println("27.satir : " + ++sayi ); //52
        System.out.println("28.satir : " + sayi);      //52
    }
}
