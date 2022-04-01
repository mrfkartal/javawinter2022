package day23_multiDimensionalArrays;

import java.util.Scanner;

public class C07_MDArrays {
    public static void main(String[] args) {

        //Soru 5) Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin

       Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir cümle yaziniz");
        String cumle = scanner.nextLine();

        String arr[]=cumle.split(" ");

        System.out.println("girdiğiniz cümledeki kelime sayisi : " + arr.length);



    }
}
