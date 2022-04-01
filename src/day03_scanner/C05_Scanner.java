package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {


    public static void main(String[] args) {

        //soru 3 kullanıcıdan yarıcap isteyip cemberib cevresini ve dairenin alaınnı hesaplayı
        //yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen cemberin yarı capını girininiz");

        double yaricap= scan.nextDouble();
        System.out.println("girdiginiz yaricap :" + yaricap);
        System.out.println("cemberin cevresi :" + 2*3.14*yaricap);
        System.out.println("dairenin alani :" + 3.14*yaricap*yaricap);
    }


}
