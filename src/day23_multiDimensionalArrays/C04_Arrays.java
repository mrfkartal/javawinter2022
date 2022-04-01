package day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays {
    public static void main(String[] args) {

        //kullanıcıya kaç elementlik bir array olusturacağını sorun
        //array i olusturup elementleri kullancııdan alip array e atayın


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen kaç elemntli bir array istediğini yazin");

        int uzunluk=scan.nextInt();  //kullancıı 5 yazdıysa

        int arr[]=new int[uzunluk];   //[0,0,0,0,0 ]kullanıcıdan 5 tane alınca böyle olacak

        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("array için  "+ (i+1)+". elemani giriniz");
            arr[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
