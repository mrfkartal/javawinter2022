package day08_ifElseIfStatements;

import java.util.Scanner;

public class Pratik {
    public static void main(String[] args) {
        ///* TASK :
        // *  Kullanicinin boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
        //
        //   INFO :
        //BMI = kilo(kg) /(boy*boy)(cm)
        //BMI <=20 oldukca zayifsiniz
        //20<BMI<=25 Normal sinirlardasiniz
        //25<BMI<=30 Sisman kategorisindesiniz
        //30<BMI ==> Obez grubundasiniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen boyunuzu yazınız");
        double boy = scan.nextDouble();
        System.out.println("lütfen kilonuzu yazınız");
        double kilo = scan.nextDouble();

        double vke = (kilo/100)*(boy/100);


        if (vke <= 20) {
            System.out.println("oldukça zayıfsınız");
        } else if (20 < vke && vke <= 25) {
           System.out.println("normal sınirdasin");
        } else if (25<vke && vke<=30){
            System.out.println("sısman katogorisindesiniz");
        }else if (30<vke) {
            System.out.println("obez grubundasınız");
             }
        }

    }



