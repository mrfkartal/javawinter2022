package day32_dateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {

    public static void main(String[] args) {

        LocalTime tm= LocalTime.now();
        System.out.println(tm); // 21:10:01.017511

        // bir islemin ne kadar surede bittigini bulmak istersek
        // islemden once ve sonra birer time objesi olusturup
        // aradaki farki hesaplayabiliriz

        int sayi=0;
        for (int i = 0; i <100000 ; i++) {
            sayi+=i;
        }

        LocalTime tmLoopSonrasi= LocalTime.now();
        System.out.println(tmLoopSonrasi); // 21:14:01.922778800

        double nano1=tm.getNano();
        double nano2=tmLoopSonrasi.getNano();

        System.out.println("islem " + (nano2-nano1) + " nanosaniyede bitti");
        // ileri veya geriye gidebiliriz

        System.out.println(tm.plusMinutes(1000)); // 13:59:49.227878
        // istersek zone id kullanarak istedigimiz bolgenin saati icin de
        // obje olusturabiliriz
    }
    }

