package day07_IfElseStatements;

import java.util.Scanner;

public class C07_HaftaninGünleriIfElseIf {
    public static void main(String[] args) {

        // Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //eger kullanici gün ismini yanlıs girerese yanlıs giris yazdırın.
        //  Ornek:      gun=Pazar output = “Hafta sonu”
        //      gun=Sali output = “Hafta ici”
        //  *** String icin equals method’unu kullanin

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen gün adı yazınız");
        String gunIsmi = scan.next().toLowerCase();

        if (gunIsmi.equals("cumartesi") || gunIsmi.equals("pazar")) {
            System.out.println("girdiginiz gün hafta sonu");
        } else if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") ||
                gunIsmi.equals("persembe") || gunIsmi.equals("cuma")) {
            System.out.println("girdiginiz gün haftaici");
        } else {
            System.out.println("lütfen gecerli bir gün ismi giriniz");
        }

        //eger if else if ...statement else ile bitiyorsa
        //olasılıklardan sadece bir tanesi mutlaka calısır
        //java ilk buldugu true ya ait sonucu yazdirir
        //ve kalan sartlara bakmaz.
        //if else if ... cumleleri else ile bitmese de calisir
        //ancak bu durumda sadece bir olasılık calısabilir veya hic bir islem yapılmayabilir
        //ali biliyorsa ali yapsın bilmiyorsa veli biliyorsa o yapsın veli bilmiyorsa ayse yapsın bilmiyorsa ...

    }
}