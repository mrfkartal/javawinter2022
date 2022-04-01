package day07_IfElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C04_HaftaiciHaftaSonu {
    public static void main(String[] args) {

        // Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:      gun=Pazar output = “Hafta sonu”
        //      gun=Sali output = “Hafta ici”
        //  *** String icin equals method’unu kullanin


        //string case sensitive dir
        //yani Pazar, PAZAR, PAzar bunlar hep farklı kelimeleridir.

        //bu durumda stiring methodlarından yardım alıiriz.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen gün ismini yazınız" );
        String gunIsmi=scan.next().toLowerCase();   //kullanıcı nasıl yazarsa yazsın biz kucuk harfe ceviriyoruz


        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")){
            System.out.println("girdiğiniz gün haftasonu");  //string yani metinsel ifadelerde == yerine equals
            //yazacağız.
        }

        if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") ||
        gunIsmi.equals("persembe") || gunIsmi.equals("cuma")){
            System.out.println("girdiginiz gün haftaici");
        }
    }

}
