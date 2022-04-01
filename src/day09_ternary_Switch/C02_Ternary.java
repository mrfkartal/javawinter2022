package day09_ternary_Switch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {


        // ternary ile yapılan tüm işlemler if else ilede yapılabilir
        //if else yerine ternary tercih etme sebebi yapinin basit ve
        // anlaşılabilir olmasidir
        //ternary icerisinde kompleks kodlar olmaz
        //sadece sonuc veya bizi sonuca götüren basit islemler olabilir

        // kullanıcıdan bir tam sayi alığ tek mi cidt mi yazdıran bir kod yazalım

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen pozitif bir tam sayi giriniz");
        int sayi= scanner.nextInt();

        //if (sayi%2==0){
          //  System.out.println("sayi çift");
        //}else {
          //  System.out.println("sayi tek");
        //}


        System.out.println(sayi%2==0 ? "sayi çift" : "sayi tek" );
    }
}
