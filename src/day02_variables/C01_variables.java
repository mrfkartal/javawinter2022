package day02_variables;

import java.awt.image.Kernel;

public class C01_variables {
    public static void main(String[] args) {
        //bir variable oluştururken içerisine koyacağım datanın alabileceği değerlere uygun
        //bir data türü seçmeliyiz
        //örneğin bir  şehrin nufüsündan bahsediyorsak
        //variablemızın data turu string boolean char veya double olamaz.
        //geriye kalan tamsayı türlerinden sehrin nufusunu içine alabilecek büyüklükte bir data türü seçebiliriz
        //biz kurs boyunca genel de tam sayılar için int, odalık sayılar için double kullanacağız//

        System.out.println("Hello World yazdıran javayı halleder");

        int level=1;

        System.out.println(level);
        System.out.println("dertler derya olmuş");
        System.out.println("ömer");

        int sezon=3;

        System.out.println(sezon);

        boolean ogrenciMi=true;

        boolean yagisVarMi=false;


        System.out.println(ogrenciMi);

        char ozelSembol='&';
        char sayi='3';
        char harf= 'k';

        System.out.println(harf);
    }
}
