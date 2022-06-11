package day10_switch_StringManuplation;

public class C04_charAt {
    public static void main(String[] args) {

        //String'de herhangi bir karakteri almak isteiğğinizde o harfin indeksini
        //kullanarak str.charAt(istenen index) yazabilririz

        String str="Java Cok Güzel";

        //j yi yazdıralim

        System.out.println(str.charAt(0));

        //u yü yazdırali

        System.out.println(str.charAt(10));

        //va yazdıralim

        System.out.println(""+str.charAt(2)+str.charAt(3));

        //cOK seklinde yazdıralim
        System.out.println(str.toLowerCase().charAt(5)+""+str.toUpperCase().charAt(6)+str.toUpperCase().charAt(7));

        //örnekteki stringde 14 harf olduguna göre son harfin index 14-1 olur

        System.out.println(str.charAt(14-1));

        System.out.println(str.length()-1);
        //uzunluk -1

        /*

         */

    }

}
