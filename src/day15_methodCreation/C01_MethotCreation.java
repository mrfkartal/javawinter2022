package day15_methodCreation;

public class C01_MethotCreation {
    public static void main(String[] args) {

        String str="Java öğrenmek cok zevkli";

        //str'in ilk 4 harfini almak istesek

        str.substring(0,4);

                // Bir program yapaken kodlarimizin daha kisa ve anlasilabilir olmasi icin
        // surekli kullanabilecegimiz kod bloklarini hazir olarak bir yere koyar
        // ihtiyacimiz oldukca oradan alip kullaniriz
        // method'lar robotlara benzer
        // method olusturmak bazen o method'un yapacagi isi yapmaktan zor olabilir
        // bir islemi sadece 1 kere yapacaksak method kullanmamiza gerek olmayabilir
        // ancak ozellikle cok kullancagimiz islemler icin
        // her seferinde yeniden ayni kodlari yazmak yerine
        // bu islemi yapan hazir bir method olusturmak cok daha pratiktir

        // bazen bir class'in icerisinde cok uzun kodlar yazarsak
        // tum class'in anlasilmasi zorlasabilir
        // bunun yerine kod'un belli kisimlarini ayri method'lar olarak olusturup
        // main method icerisinden istedigimiz sekilde bu methodlari yonetebiliriz.

    }
}
