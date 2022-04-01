package day06_concanation_Operatörs;

public class C01_Concatenation {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Guzel";
        int sayi1=5;
        int sayi2=3;

        //variablelarin değerrini değiştirmenden asadaki ifadeleri variableleri kullanarak yazıdırın

        //Java5Güzel

        System.out.println(str1+sayi1+str2);

        //2Guzel15

        System.out.println((sayi1-sayi2)+str2+(sayi1*sayi2));

        //java22

        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2));

        //53Guzel
        System.out.println((sayi1)+(sayi2+str2));
        System.out.println(""+sayi1+sayi2+str2);
        System.out.println(""+sayi1+sayi2+str2); //sayıları konket etmek ""

        /*
        eger tamamen sayılardan olusan bir string varsa ve biz bunu integere cevirmek istersek
        integer.value(str)

        bir sayiyi stringe cevirmek istersem sayi ya başına ya sonura bir hiçlikle toplarım.
        ""+sayi olarak toplarız.
         */
    }
}
