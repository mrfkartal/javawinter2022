package day20_scope_Arrays;

public class C02_staticVariables {

    //**instance variable lar objeye bagımlıdır ve her obje farklı değerler alabilir
    //ogrenci notları veya öüretmen branslari gibi
    //bir objeye ait bir variable in son degerini bulmak icin sadece o  objeyi dikkate aliriz

    //**static variable ise class variable olarak tanımlanir ve tüm calss üyeleri icin aynidir. Okul ismi,
    //okul müdürüünün adi gibi eger static variable in degeri degistirilirse herkes icin degisir




    static String okulIsmi="yıldız koleji";
    static int okulNo;
    static boolean okulAcikMi;



    public static void main(String[] args) {

        System.out.println(okulIsmi);  //yıldız koleji
        System.out.println(okulNo);   //0
        okulNo=102;
        System.out.println(okulNo);   //102
        System.out.println(okulAcikMi);   //false değer atamasi yapılmadığı için default degeri!

        staticMethod();
        System.out.println(okulNo);  //200

    }

    public static void staticMethod(){

        okulNo=200;
        System.out.println(okulNo);   //200  bu method calışmaz çalışması için cağrılması lazım
        //calısması iniv yukarıda main method içinde staticMethod u cağırmamz lazım
    }
}
