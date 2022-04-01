package day07_IfElseStatements;

import java.util.Scanner;

public class C06_Emelilik {
    public static void main(String[] args) {

        //kullanıcıdan yasını isteyin 65 veya daha büyükse emekli
        //olabilirsin. 65 den daha küçük ise emekli olamazsın yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen yaşınızı giriniz");
        int yas=scan.nextInt();

        if (yas>=65){
            System.out.println("emekli olabilirsin");
        } else {
            System.out.println("emekli olamazsın");
            System.out.println(65-yas +" sene daha calısmalısın");
        }

        //if else statement larda iki durumdan sadece ve sadece biri calısır
        //ikisinin birden calısma ihtimali yokturrr
        //ikisininde çalışmamma ihtimalli yokturrr
    }
}
