package day16_MethodCreation;

public class C02_Overloading {

    public static void main(String[] args) {


        String str="bu da gecer ya Huu";
        System.out.println(str.indexOf("d"));    //3
        System.out.println(str.indexOf("a",5));  //5.index ten sonra ilk a 13. indextedir
        System.out.println(str.indexOf('a',5)); //hem charda hemde str de çalışır

        //bir classta aynı isimde birden fazla method olmasina overloading denilir
        //ya parametre sayisi farkli olmali
        //veya para sayisi ayni ise argumentlerin data türleri farkli olmali


    }
}
