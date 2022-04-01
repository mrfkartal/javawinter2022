package day07_IfElseStatements;

import java.util.Scanner;

public class C08_Odevlers {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen diktörgenin kenar uzunluklarını yazın");
        int aKenar=scan.nextInt();
        int bKenar=scan.nextInt();

        if (aKenar==bKenar){
            System.out.println("uzunluklarını girdiğiniz çokgen karedir");
        }
        if (aKenar!=bKenar){
            System.out.println("uzunluğunu girdiğiniz çokgen dikdörtgendir.");
        }
    }
}
