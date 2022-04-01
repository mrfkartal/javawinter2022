package day09_ternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {


        int sayi=-120;
        //verilen sayının 3 veya daha çok basamaklı olup olmadığını
        // kontrol eden ve sonucu yazdiran bir ternary yazın

        String sonuc =sayi>=100 ? "sayi 3 basamaklı veya daha büyük" : "sayi negatif veya 3 basamaktan küçük";

        //ternary bize sonuc döndürdüğü için ya bu sonucu direk yazdırmalıyız ya da sonucun data türüne uygun
        //bir variable a atama yapabiliriz.

        System.out.println("girdiginiz sayi anaklizi : " + sonuc );

    }
}
