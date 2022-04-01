package day32_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_IkiTarihArasiniBulma {

    public static void main(String[] args) {

        LocalDate bugun=LocalDate.now();

        LocalDate dogumgunu=LocalDate.of(1989, 03,26); //P33Y5D

        System.out.println(Period.between(dogumgunu, bugun));

        System.out.println(Period.between(dogumgunu,bugun).getYears()); //33

        // FIXME: 31.03.2022



    }
}
