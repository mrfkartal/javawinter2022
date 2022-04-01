package day07_IfElseStatements;

import java.util.Scanner;

public class C08_Odevler {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir gün adı yazınız");
        String gunAdi=scan.next().toLowerCase();

        if (gunAdi.equals("cuma")){
            System.out.println("müslümanlar için kutsal gündür");
        }
        if (gunAdi.equals("cumartesi")){
            System.out.println("yahudiler için kutsal gündür");
        }
        if (gunAdi.equals("pazar")){
            System.out.println("hristiyanlar için kutsal gündür");
        }else {
            System.out.println("lütfen kutsal bir gün yazınız");
        }
    }
}
