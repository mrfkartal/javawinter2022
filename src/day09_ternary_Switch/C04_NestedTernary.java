package day09_ternary_Switch;

public class C04_NestedTernary {
    public static void main(String[] args) {

        //verilen sayının pozitif mi negatif mi olduğunu kontrol edip
        //0 veya pozitif sayı ise tek veya çift
        //negatif sayi ise -100'den büyük veya küçük olduğunu belirleyen bir ternary yaziniz


        int sayi = 10;
        if (sayi >= 0) {
            if (sayi % 2 == 0) {
                System.out.println("sayi pozitif çift sayi");
            } else {
                System.out.println("sayi pozitif tek sayi");
            }
        } else {
            if (sayi < -100) {
                System.out.println("sayi -100  den küçük negatif sayi");
            } else {
                System.out.println("sayi -100 den büyük negatif sayi");
            }

        }

        String sonuc=sayi>=0 ? // karışmaması için alt satira alalım
                        (sayi%2==0 ? "pozitif çift sayi" : "pozitif tek sayi") :
                        (sayi<-100 ? "-100 den küçük negatif" : "-100'den büyük negatif sayi");

        System.out.println(sonuc);
    }
}
