package day33_Varargs_StringBuilder;

public class C04_StringBuilder {
    public static void main(String[] args) {


        StringBuilder sb1= new StringBuilder("Yasasin Java");

        System.out.println(sb1.indexOf("Java")); // 8 metin icindeki index numarasi verir
        System.out.println(sb1.lastIndexOf("s")); // 4 istenen kelimenin sondan baslana
        //baslanarak nerde olduguunu bulur ve bastan kacinci indexte oldugu nu gosterir

        System.out.println(sb1.indexOf("s")); // 2
        System.out.println(sb1.replace(0,7,"Ne guzel"));
        //replace metin iicinde 0 ile 7. index arasini sil yerine istenen "ne guzel" yaz
        //diyor
        System.out.println(sb1); // Ne guzel Java **  mutable oldugu icin artik degisti
        System.out.println(sb1.toString().toUpperCase()); // NE GUZEL JAVA
        System.out.println(sb1); // Ne guzel Java

        System.out.println(sb1.delete(0,3)); // guzelJava
        System.out.println(sb1.deleteCharAt(5)); // guzelJava
    }
}
