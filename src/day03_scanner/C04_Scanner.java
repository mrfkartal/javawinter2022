package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {


        //Scanner kullanmak için 3 adım takip ediyoruz
        //1.adım kendimize bir scanner oluşturmak

        Scanner scan = new Scanner(System.in);          //esitligin saginda yeni bir scanner olusturulur
                                                        //ve olusturulan bu scanner scan variablena assing edilir
                                                        // scan variable'in ismidir, istediğimiz ismi verebiliriz.


        //2.adım kullanıcıdan istediğimiz değeri girmesi için açıklayıcı bilgi yazdırın

        System.out.println("lütfen adınızı giriniz");

        //3.adım kullanıcının girdiği değeri uygun veriable olusuturp kaydedin


        String kullanıcıIsmi=scan.next();   //sadece ilk kelimeyi almak istiyorsa next yazarız
                                                // tüm satırı almak istiyorsak nextline ı alırız

        System.out.println("kullanıcın girdigi isim :" + kullanıcıIsmi);






    }
}
