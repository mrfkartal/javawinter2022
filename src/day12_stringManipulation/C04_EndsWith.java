package day12_stringManipulation;

import java.util.Scanner;

public class C04_EndsWith {
    public static void main(String[] args) {

    // Soru 1) Kullanicidan email adresini girmesini isteyin,
    // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
    // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
    // @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin
    // mehmet@gmail.com.tr


        String email = "mehmet@gmail.com.tr";
        String arananMetin = "@gmail.com";

        if (!email.contains(arananMetin)){
            System.out.println("lütfen gmail adresi giriniz");
        } else if (email.endsWith(arananMetin)){
            System.out.println("email adresiniz kaydedildi");
        }else{
            System.out.println("lütfen yazimi kontrol ediniz");
        }

}

}

