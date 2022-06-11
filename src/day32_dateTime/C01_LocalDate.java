package day32_dateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDate {

    public static void main(String[] args) {


        LocalDate trh = LocalDate.now(); // objenin olusturuldugu tarihi trh'ye atar
        LocalDate baskaTrh=LocalDate.of(1972,1,18);
        // istedigimiz yil,ay ve gun degerlerine gore bize obje olusturur

        System.out.println(trh); // 2022-03-31

        // get'li method'larla tarih ile ilgili detay bilgileri alabiliriz
        System.out.println(trh.getDayOfMonth()); // 31 ayin hangi gunu oldugu
        System.out.println(trh.getDayOfWeek()); // THURSDAY haftanin hangi gun oldudu
        System.out.println(trh.getMonthValue()); // 3 yilin hangi ayi oldugu
        System.out.println(trh.getYear()); // 2022 hangi yilda oldugumuz

        // bir tarihten istedigimiz kadar ileri veya geri gidebiliriz minus geri gel plus iler git

        System.out.println(trh.minusWeeks(20)); // 2021-11-11 bulundugumuz gunden 20 hafta geri gel
        System.out.println(trh.minusWeeks(5).minusDays(3)); // 2022-02-21 bulundugumuz gunden 5 hafta 3 gun geri gel
        System.out.println(trh.plusMonths(9).plusDays(10)); // 2023-01-10

        // Istedigimiz ulkenin o andaki tarihini elde etmek istersek
        LocalDate trhZone= LocalDate.now(ZoneId.of("Japan"));
        System.out.println(trhZone); // 2022-04-01

        // is ile baslayan method'lar boolean sonuclar dondurur
        System.out.println(LocalDate.now().isLeapYear()); // false
        System.out.println(trh.isAfter(baskaTrh)); // true
    }

}
