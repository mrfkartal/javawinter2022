package day14_stringManipulation;

public class C05_SifreKontrol {
    public static void main(String[] args) {

        /*
        // Soru 6) Kullanicidan bir sifre girmesini isteyin.
        // Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        // sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //  - Ilk harf buyuk harf olmali
        //  - Son harf kucuk harf olmali
        //  - Sifre bosluk icermemeli
        //  - Sifre uzunlugu en az 8 karakter olmali
                 */
        String sifre="Asdf1234586s";

        boolean ilkHarf=false;
        if (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z'){
            ilkHarf=true;
        }else{
            System.out.println("sifrenizin ilk harfi büyük harf olmali");
        }

        boolean sonHarf=false;
        if (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z'){
            sonHarf=true;
        }else{
            System.out.println("sifrenizin son harfi küçük harf olmali");
        }

        boolean bosluk=false;
        if (!sifre.contains(" ")){
            bosluk=true;
        }else{
            System.out.println("sifrede bosluk olmamalı");
        }
        boolean uzunluk=false;
        if (sifre.length()>=8){
            uzunluk=true;
        }else{
            System.out.println("sifre en az 8 karakter içermelidir");
        }

        //ifleri ay ayrı yaparsak hepsi başına buyruk çalışır. bu soruda da bağımsız if
        //kullandık. sifresinin doğru girildiğinde doğru girildi diye yazmaası içinde yine
        //bağımsız if yapıp başarılı şekilde kaydedildi yazsırıaz

        if (ilkHarf && sonHarf && bosluk && uzunluk){
            System.out.println("sifrenin doğru ve kaydedildi");
        }
    }
}
