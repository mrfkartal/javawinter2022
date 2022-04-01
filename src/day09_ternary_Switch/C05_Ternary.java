package day09_ternary_Switch;

public class C05_Ternary {
    public static void main(String[] args) {

        //bazen ternary de ki iki sonucun data türleri farklı olabilir
        //for example;

        //verilen sayı 100'den büyükse sayi 'nin karesini alıp yazdıran
        //100'den küçükse "sayi 100 den büyük olmali " yazdıran
        //bir ternary olusturalım

        int sayi=50;
        //ternary bize sonutgetirdiğinde ya sonucu direk yazdıralıyız
        // veya bir değişkene atamalıyız
        //eger sonuclar farklı data türlerinde ise atama yapcağımız variable ın data türü tek olacağından
        //atama yapamayız
        //SADECE DİREK YAZDIRABİLŞİRİZ

        System.out.println( sayi>100 ? sayi*sayi : "sayi 100 den büyük olmalı");

    }
}
