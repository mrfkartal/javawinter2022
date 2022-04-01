package day12_stringManipulation;

public class C03_Contain {
    public static void main(String[] args) {

        // Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin



        String email = "mülkiyeayboy@gmail.com";
        String arananMetin = "@gmail.com";

        if (!email.contains(arananMetin)) { //contains olduğu için true false döencek
            // ayrıca ! işareti olumsuz yapacağı için cevap false olacak

            System.out.println("lütfen mail adresinizi giriniz");
        } else if (email.lastIndexOf(arananMetin) == email.length() - 10) {
            //burdaki lastindexof tan kastımız son da girilmesi gereken @gmail.com ile
            //bitip bitmediğini doğrulayacak  için -10 yazdık @gmail.com 10 karakter olcağı ...
            System.out.println("emailiniz kaydedildi");
        } else {
            System.out.println("lütfen yazimi kontrol ediniz");

        }
    }
}
