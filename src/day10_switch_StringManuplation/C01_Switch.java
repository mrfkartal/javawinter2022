package day10_switch_StringManuplation;

import java.util.Scanner;

public class C01_Switch {
    public static void main(String[] args) {
        //kullanıcıdan sayi olarak  kaçinci ay olduğunu alip
        //istenen ay ismini yazdiran bir program yaziniz

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen kaçcıncı ay olduğunu giriniz");
        int ayNo=scan.nextInt();

        //bu soruyu if else ile yapabiliriz ama art arda 12 if else çok kalabalık ve
        //anlaşılması güç olabilir
        //bunun yerine switch - case yapisini kullanabiliriz

        switch (ayNo){

            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("subat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayıs");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("ağustos");
                break;
            case 9:
                System.out.println("eylül");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasım");
                break;
            case 12:
                System.out.println("aralık");
                break;
            default:
                System.out.println("lütfen geçerli bir ay numarası giriniz");

        }

        //swıtch icine yazılan variable degerine göre ilgli case i bulur yazdırmaya
        // başlar break yazılan yere
        //kadar yazdırmaya devam eder.
        //eger break yazılmazsa tüm caseleri çalıştırır
        //if else deki son else gibi geriye kalan durumları tamamen
        //kapsayacak bir satir daha ekleyebiliriz



    }
}
