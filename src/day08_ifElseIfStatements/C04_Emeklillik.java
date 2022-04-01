package day08_ifElseIfStatements;

import java.util.Scanner;

public class C04_Emeklillik {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir adet pozitif tam sayi yazınız");
        int sayi=scan.nextInt();
        if (sayi>=100 && sayi<=999){
            System.out.println("3 basamaklı sayidir");
        }else if (sayi%2==0 && sayi<99) {
            System.out.println("girdiginiz sayi cift sayidir");
        } else if (sayi%2!=0 && sayi<99){
            System.out.println("girdiginiz sayi tek sayidir");
        }
    }
}
