package day33_Varargs_StringBuilder;

public class C02_Varargs {

    public static void main(String[] args) {
        // parametre olarak bir int
        // ve istedigimiz kadar String alan
        // en uzun kelimenin harf sayisi ile int parametre degerini
        // carpip sonucu yazdiran bir method olusturun
        int sayi=5;
        String str1="Zulal";
        String str2="Zeynep";
        String str3="Ali";
        carpim(sayi, str1,str2,str3);
        // Bir method'da varargs disinda parametre kullanacaksak
        // once diger parametreleri yazip, varargs'i en sona yazmaliyiz
        // Bu sebeple bir method'da birden fazla varargs olamaz
    }
    private static void carpim( int sayi, String... str ) {
        String enUzunStr="";
        for (String each: str
        ) {
            if (each.length()>enUzunStr.length()){
                enUzunStr=each;
            }
        }
        System.out.println("Istenen deger : " + sayi * enUzunStr.length());
    }
}
