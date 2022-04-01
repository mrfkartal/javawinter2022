package day07_IfElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C05_IfElseHaftaninGunleri {
    public static void main(String[] args) {

        // Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:      gun=Pazar output = “Hafta sonu”
        //      gun=Sali output = “Hafta ici”
        //  *** String icin equals method’unu kullanin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir gün ismi giriniz");
        String gunIsmi=scan.next().toUpperCase();

        if (gunIsmi.equals("PAZAR") || (gunIsmi.equals("CUMARTESI"))) {
            System.out.println("girdiğiniz gun haftasonudur");
        } else {
            System.out.println("girdiğiniz gün haftaicidir");
        }

        }
    }

